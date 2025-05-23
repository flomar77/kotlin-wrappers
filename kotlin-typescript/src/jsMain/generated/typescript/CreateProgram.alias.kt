// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

/** Create the program with rootNames and options, if they are undefined, oldProgram and new configFile diagnostics create new program */
typealias CreateProgram<T /* : BuilderProgram */> = (
    rootNames: ReadonlyArray<String>?,
    options: CompilerOptions?,
    host: CompilerHost?,
    oldProgram: T?,
    configFileParsingDiagnostics: ReadonlyArray<Diagnostic>?,
    projectReferences: ReadonlyArray<ProjectReference>?,
) -> T
