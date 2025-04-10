package electron.core


external interface Rectangle {
// Docs: https://electronjs.org/docs/api/structures/rectangle
    /**
     * The height of the rectangle (must be an integer).
     */
    var height: Double

    /**
     * The width of the rectangle (must be an integer).
     */
    var width: Double

    /**
     * The x coordinate of the origin of the rectangle (must be an integer).
     */
    var x: Double

    /**
     * The y coordinate of the origin of the rectangle (must be an integer).
     */
    var y: Double
}
