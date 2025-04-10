// Automatically generated - do not modify!

package web.svg

/**
 * Correspond to the <length> basic data type.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength)
 */
sealed external class SVGLength {
    val unitType: Short
    var value: Double
    var valueAsString: String
    var valueInSpecifiedUnits: Double
    fun convertToSpecifiedUnits(unitType: Number)
    fun newValueSpecifiedUnits(
        unitType: Number,
        valueInSpecifiedUnits: Number,
    )

    val SVG_LENGTHTYPE_UNKNOWN: Short
    val SVG_LENGTHTYPE_NUMBER: Short
    val SVG_LENGTHTYPE_PERCENTAGE: Short
    val SVG_LENGTHTYPE_EMS: Short
    val SVG_LENGTHTYPE_EXS: Short
    val SVG_LENGTHTYPE_PX: Short
    val SVG_LENGTHTYPE_CM: Short
    val SVG_LENGTHTYPE_MM: Short
    val SVG_LENGTHTYPE_IN: Short
    val SVG_LENGTHTYPE_PT: Short
    val SVG_LENGTHTYPE_PC: Short

    companion object {
        val SVG_LENGTHTYPE_UNKNOWN: Short
        val SVG_LENGTHTYPE_NUMBER: Short
        val SVG_LENGTHTYPE_PERCENTAGE: Short
        val SVG_LENGTHTYPE_EMS: Short
        val SVG_LENGTHTYPE_EXS: Short
        val SVG_LENGTHTYPE_PX: Short
        val SVG_LENGTHTYPE_CM: Short
        val SVG_LENGTHTYPE_MM: Short
        val SVG_LENGTHTYPE_IN: Short
        val SVG_LENGTHTYPE_PT: Short
        val SVG_LENGTHTYPE_PC: Short
    }
}
