@file:Suppress("unused")

package kotlinx.css

import kotlinx.css.properties.*
import kotlin.js.JsName
import kotlin.reflect.KProperty

class CssDeclarations : MutableMap<String, Any> by LinkedHashMap() {
    private var stringDecl: String? = null
        get() = field ?: buildString {
            this@CssDeclarations.forEach { (k, v) ->
                append("${k.hyphenize()}: ${v};\n")
            }
        }.also { field = it }

    override fun equals(other: Any?) = this.calculateEquals(other) { otherDecls ->
        stringDecl == otherDecls.stringDecl
    }

    override fun hashCode(): Int {
        return stringDecl.hashCode()
    }

    override fun toString(): String {
        return stringDecl!!
    }

    operator fun set(name: String, value: Any) {
        put(name, value)
        stringDecl = null
    }
}


interface StyledElement {
    val declarations: CssDeclarations

    fun put(key: String, value: String) {
        declarations[key] = value
    }
}

typealias StyledElementBuilder = StyledElement.() -> Unit

@JsName("StyledElement_create")
fun StyledElement(): StyledElement {
    return StyledElementImpl()
}

class StyledElementImpl : StyledElement {
    override val declarations = CssDeclarations()
}

private class CssProperty<T>(private val default: (() -> T)? = null) {
    operator fun getValue(thisRef: StyledElement, property: KProperty<*>): T {
        default?.let { default ->
            if (!thisRef.declarations.containsKey(property.name)) {
                thisRef.declarations[property.name] = default() as Any
            }
        }

        @Suppress("UNCHECKED_CAST")
        return thisRef.declarations[property.name] as T
    }

    operator fun setValue(thisRef: StyledElement, property: KProperty<*>, value: T) {
        thisRef.declarations[property.name] = value as Any
    }
}

var StyledElement.alignContent: Align by CssProperty()
var StyledElement.alignItems: Align by CssProperty()
var StyledElement.alignSelf: Align by CssProperty()
var StyledElement.animation by CssProperty { Animations() }
var StyledElement.animationDelay: Time by CssProperty()
var StyledElement.animationDirection: AnimationDirection by CssProperty()
var StyledElement.animationDuration: Time by CssProperty()
var StyledElement.animationFillMode: FillMode by CssProperty()
var StyledElement.animationIterationCount: Number by CssProperty()
var StyledElement.animationName: String by CssProperty()
var StyledElement.animationPlayState: PlayState by CssProperty()
var StyledElement.animationTimingFunction: Timing by CssProperty()
var StyledElement.appearance: Appearance by CssProperty()
var StyledElement.aspectRatio: AspectRatio by CssProperty()
var StyledElement.backdropFilter: String by CssProperty()
var StyledElement.backfaceVisibility: Visibility by CssProperty()
var StyledElement.background: String by CssProperty()
var StyledElement.backgroundAttachment: BackgroundAttachment by CssProperty()
var StyledElement.backgroundClip: BackgroundClip by CssProperty()
var StyledElement.backgroundColor: Color by CssProperty()
var StyledElement.backgroundImage: Image by CssProperty()
var StyledElement.backgroundOrigin: BackgroundOrigin by CssProperty()
var StyledElement.backgroundPosition: RelativePosition
    get() = RelativePosition(declarations["background-position"] as String)
    set(position) = put("background-position", position.value)
var StyledElement.backgroundRepeat: BackgroundRepeat by CssProperty()
var StyledElement.backgroundSize: String by CssProperty()
var StyledElement.borderBottomColor: Color by CssProperty()
var StyledElement.borderBottomLeftRadius: LinearDimension by CssProperty()
var StyledElement.borderBottomRightRadius: LinearDimension by CssProperty()
var StyledElement.borderBottomStyle: BorderStyle by CssProperty()
var StyledElement.borderBottomWidth: LinearDimension by CssProperty()
var StyledElement.borderCollapse: BorderCollapse by CssProperty()
var StyledElement.borderColor: Color by CssProperty()
var StyledElement.borderLeftColor: Color by CssProperty()
var StyledElement.borderLeftStyle: BorderStyle by CssProperty()
var StyledElement.borderLeftWidth: LinearDimension by CssProperty()
var StyledElement.borderRadius: LinearDimension by CssProperty()
var StyledElement.borderRightColor: Color by CssProperty()
var StyledElement.borderRightStyle: BorderStyle by CssProperty()
var StyledElement.borderRightWidth: LinearDimension by CssProperty()
var StyledElement.borderSpacing: LinearDimension by CssProperty()
var StyledElement.borderStyle: BorderStyle by CssProperty()
var StyledElement.borderTopColor: Color by CssProperty()
var StyledElement.borderTopLeftRadius: LinearDimension by CssProperty()
var StyledElement.borderTopRightRadius: LinearDimension by CssProperty()
var StyledElement.borderTopStyle: BorderStyle by CssProperty()
var StyledElement.borderTopWidth: LinearDimension by CssProperty()
var StyledElement.borderWidth: LinearDimension by CssProperty()
var StyledElement.bottom: LinearDimension by CssProperty()
var StyledElement.boxShadow by CssProperty { BoxShadows() }
var StyledElement.boxSizing: BoxSizing by CssProperty()
var StyledElement.breakInside: BreakInside by CssProperty()
var StyledElement.clear: Clear by CssProperty()
var StyledElement.clipPath: String by CssProperty()
var StyledElement.color: Color by CssProperty()
var StyledElement.columnGap: LinearDimension by CssProperty()
var StyledElement.contain: Contain by CssProperty()
var StyledElement.containerName: ContainerName by CssProperty()
var StyledElement.containerType: ContainerType by CssProperty()
var StyledElement.content: QuotedString by CssProperty()
var StyledElement.cursor: Cursor by CssProperty()
var StyledElement.direction: Direction by CssProperty()
var StyledElement.display: Display by CssProperty()
var StyledElement.filter: String by CssProperty()
var StyledElement.flexBasis: FlexBasis by CssProperty()
var StyledElement.flexDirection: FlexDirection by CssProperty()
var StyledElement.flexGrow: Number by CssProperty()
var StyledElement.flexShrink: Number by CssProperty()
var StyledElement.flexWrap: FlexWrap by CssProperty()
var StyledElement.float: Float by CssProperty()
var StyledElement.fontFamily: String by CssProperty()
var StyledElement.fontFeatureSettings: String by CssProperty()
var StyledElement.fontSize: LinearDimension by CssProperty()
var StyledElement.fontSizeAdjust: Number by CssProperty()
var StyledElement.fontStyle: FontStyle by CssProperty()
var StyledElement.fontWeight: FontWeight by CssProperty()
var StyledElement.gap: LinearDimension by CssProperty()
var StyledElement.gridAutoColumns: GridAutoColumns by CssProperty()
var StyledElement.gridAutoFlow: GridAutoFlow by CssProperty()
var StyledElement.gridAutoRows: GridAutoRows by CssProperty()
var StyledElement.gridColumn: GridColumn by CssProperty()
var StyledElement.gridColumnEnd: GridColumnEnd by CssProperty()
var StyledElement.gridColumnStart: GridColumnStart by CssProperty()
var StyledElement.gridRow: GridRow by CssProperty()
var StyledElement.gridRowEnd: GridRowEnd by CssProperty()
var StyledElement.gridRowStart: GridRowStart by CssProperty()
var StyledElement.gridTemplate: GridTemplate by CssProperty()
var StyledElement.gridTemplateAreas: GridTemplateAreas by CssProperty()
var StyledElement.gridTemplateColumns: GridTemplateColumns by CssProperty()
var StyledElement.gridTemplateRows: GridTemplateRows by CssProperty()
var StyledElement.height: LinearDimension by CssProperty()
var StyledElement.hyphens: Hyphens by CssProperty()
var StyledElement.isolation: Isolation by CssProperty()
var StyledElement.justifyContent: JustifyContent by CssProperty()
var StyledElement.justifyItems: JustifyItems by CssProperty()
var StyledElement.left: LinearDimension by CssProperty()
var StyledElement.letterSpacing: LinearDimension by CssProperty()
var StyledElement.lineHeight: LineHeight by CssProperty()
var StyledElement.listStylePosition: ListStylePosition by CssProperty()
var StyledElement.listStyleType: ListStyleType by CssProperty()
var StyledElement.marginBottom: LinearDimension by CssProperty()
var StyledElement.marginLeft: LinearDimension by CssProperty()
var StyledElement.marginRight: LinearDimension by CssProperty()
var StyledElement.marginTop: LinearDimension by CssProperty()
var StyledElement.maxHeight: LinearDimension by CssProperty()
var StyledElement.maxWidth: LinearDimension by CssProperty()
var StyledElement.minHeight: LinearDimension by CssProperty()
var StyledElement.minWidth: LinearDimension by CssProperty()
var StyledElement.objectFit: ObjectFit by CssProperty()
var StyledElement.objectPosition: String by CssProperty()
var StyledElement.opacity: Number by CssProperty()
var StyledElement.order: Order by CssProperty()
var StyledElement.outline: Outline by CssProperty()
var StyledElement.outlineColor: Color by CssProperty()
var StyledElement.outlineOffset: LinearDimension by CssProperty()
var StyledElement.outlineStyle: OutlineStyle by CssProperty()
var StyledElement.outlineWidth: LinearDimension by CssProperty()
var StyledElement.overflow: Overflow by CssProperty()
var StyledElement.overflowAnchor: OverflowAnchor by CssProperty()
var StyledElement.overflowWrap: OverflowWrap by CssProperty()
var StyledElement.overflowX: Overflow by CssProperty()
var StyledElement.overflowY: Overflow by CssProperty()
var StyledElement.overscrollBehavior: OverscrollBehavior by CssProperty()
var StyledElement.paddingBottom: LinearDimension by CssProperty()
var StyledElement.paddingLeft: LinearDimension by CssProperty()
var StyledElement.paddingRight: LinearDimension by CssProperty()
var StyledElement.paddingTop: LinearDimension by CssProperty()
var StyledElement.pointerEvents: PointerEvents by CssProperty()
var StyledElement.position: Position by CssProperty()
var StyledElement.resize: Resize by CssProperty()
var StyledElement.right: LinearDimension by CssProperty()
var StyledElement.rowGap: LinearDimension by CssProperty()
var StyledElement.scrollBehavior: ScrollBehavior by CssProperty()
var StyledElement.scrollMarginBottom: LinearDimension by CssProperty()
var StyledElement.scrollMarginLeft: LinearDimension by CssProperty()
var StyledElement.scrollMarginRight: LinearDimension by CssProperty()
var StyledElement.scrollMarginTop: LinearDimension by CssProperty()
var StyledElement.scrollPaddingBottom: LinearDimension by CssProperty()
var StyledElement.scrollPaddingLeft: LinearDimension by CssProperty()
var StyledElement.scrollPaddingRight: LinearDimension by CssProperty()
var StyledElement.scrollPaddingTop: LinearDimension by CssProperty()
var StyledElement.src: String by CssProperty()
var StyledElement.tableLayout: TableLayout by CssProperty()
var StyledElement.tabSize: String by CssProperty()
var StyledElement.textAlign: TextAlign by CssProperty()
var StyledElement.textDecoration: TextDecoration by CssProperty()
var StyledElement.textOverflow: TextOverflow by CssProperty()
var StyledElement.textTransform: TextTransform by CssProperty()
var StyledElement.textWrap: TextWrap by CssProperty()
var StyledElement.top: LinearDimension by CssProperty()
var StyledElement.touchAction: TouchAction by CssProperty()
var StyledElement.transform by CssProperty { Transforms() }
var StyledElement.transition by CssProperty { Transitions() }
var StyledElement.transitionDelay: Time by CssProperty()
var StyledElement.transitionDuration: Time by CssProperty()
var StyledElement.transitionProperty: String by CssProperty()
var StyledElement.transitionTimingFunction: Timing by CssProperty()
var StyledElement.userSelect: UserSelect by CssProperty()
var StyledElement.verticalAlign: VerticalAlign by CssProperty()
var StyledElement.visibility: Visibility by CssProperty()
var StyledElement.whiteSpace: WhiteSpace by CssProperty()
var StyledElement.width: LinearDimension by CssProperty()
var StyledElement.willChange: String by CssProperty()
var StyledElement.wordBreak: WordBreak by CssProperty()
var StyledElement.wordSpacing: LinearDimension by CssProperty()
var StyledElement.wordWrap: WordWrap by CssProperty()
var StyledElement.zIndex: Int by CssProperty()

internal fun getShorthandValue(
    top: LinearDimension,
    right: LinearDimension,
    bottom: LinearDimension,
    left: LinearDimension,
): String {
    return if (top == bottom && right == left) {
        if (top == right) {
            "$top"
        } else {
            "$top $right"
        }
    } else {
        if (right == left) {
            "$top $right $bottom"
        } else {
            "$top $right $bottom $left"
        }
    }
}

