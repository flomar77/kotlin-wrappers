import ts from "typescript";
import * as karakum from "karakum";

const eventHandlerMethods = new Set([
    // nodejs style events
    "on",
    "once",
    "emit",
    "addListener",
    "removeListener",
    "prependListener",
    "prependOnceListener",
])

function extractEventContainer(node) {
    if (
        node.parent
        && ts.isLiteralTypeNode(node.parent)

        && node.parent.parent
        && ts.isParameter(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text === "event"

        && node.parent.parent.parent
        && (
            (
                ts.isMethodDeclaration(node.parent.parent.parent)
                && ts.isIdentifier(node.parent.parent.parent.name)
                && eventHandlerMethods.has(node.parent.parent.parent.name.text)

                && node.parent.parent.parent.parent
                && ts.isClassDeclaration(node.parent.parent.parent.parent))
            || (
                ts.isMethodSignature(node.parent.parent.parent)
                && ts.isIdentifier(node.parent.parent.parent.name)
                && eventHandlerMethods.has(node.parent.parent.parent.name.text)

                && node.parent.parent.parent.parent
                && ts.isInterfaceDeclaration(node.parent.parent.parent.parent)
            )
        )
    ) {
        return node.parent.parent.parent.parent
    }

    return null
}

export default {
    setup(context) {
        this.events = new Map()
    },

    traverse(node, context) {
        if (ts.isStringLiteral(node)) {
            const eventContainer = extractEventContainer(node)
            if (!eventContainer) return null

            const name = eventContainer.name
            if (!name) return null

            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
            const typeChecker = typeScriptService?.program.getTypeChecker()

            const symbol = typeChecker?.getSymbolAtLocation(name)
            if (!symbol) return

            const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
            const namespace = karakum.findClosest(node, ts.isModuleDeclaration)

            const events = this.events.get(symbol) ?? {
                sourceFileName,
                namespace,
                containerName: name.text,
                eventNames: new Set()
            }

            events.eventNames.add(node.text)

            this.events.set(symbol, events)
        }
    },

    render(node, context) {
        if (ts.isStringLiteral(node)) {
            const eventContainer = extractEventContainer(node)
            if (!eventContainer) return null

            const name = eventContainer.name
            if (!name) return null

            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
            const typeChecker = typeScriptService?.program.getTypeChecker()

            const symbol = typeChecker?.getSymbolAtLocation(name)
            if (!symbol) return null

            const events = this.events.get(symbol)
            if (!events) return null

            return `${events.containerName}Event.${karakum.constIdentifier(node.text)}`
        }

        return null
    },

    generate(context) {
        const configurationService = context.lookupService(karakum.configurationServiceKey)
        const configuration = configurationService?.configuration
        if (configuration === undefined) throw new Error("EventPlugin.js can't work without ConfigurationService")

        const namespaceInfoService = context.lookupService(karakum.namespaceInfoServiceKey)
        const resolveNamespaceStrategy = namespaceInfoService?.resolveNamespaceStrategy?.bind(namespaceInfoService)
        if (resolveNamespaceStrategy === undefined) throw new Error("AnonymousDeclarationPlugin can't work without NamespaceInfoService")

        const declarations = Array.from(this.events.values()).map(events => {
            const name = `${events.containerName}Event`

            const entries = Array.from(events.eventNames).map(eventName => {
                const key = karakum.constIdentifier(eventName)
                return [key, eventName]
            })

            const keys = entries.map(([key]) => key)

            const body = keys
                .map(key => `object ${key} : ${name}`)
                .join("\n")

            const jsName = entries
                .map(([key, value]) => `${key}: '${value}'`)
                .join(", ")

            const declaration = `
@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{${jsName}}/*union*/)""")
sealed external interface ${name} : node.events.EventType {
${body}
}
            `

            return {
                sourceFileName: events.sourceFileName,
                namespace: events.namespace,
                fileName: `${name}.kt`,
                body: declaration,
            }
        })

        return karakum.generateDerivedDeclarations(declarations, configuration, resolveNamespaceStrategy);
    },
}
