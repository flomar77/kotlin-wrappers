package electron.core


external interface MouseInputEvent : InputEvent {
// Docs: https://electronjs.org/docs/api/structures/mouse-input-event
    /**
     * The button pressed, can be `left`, `middle`, `right`.
     */
    var button: (MouseInputEventButton)?
    var clickCount: Double?
    var globalX: Double?
    var globalY: Double?
    var movementX: Double?
    var movementY: Double?

    /**
     * The type of the event, can be `mouseDown`, `mouseUp`, `mouseEnter`,
     * `mouseLeave`, `contextMenu`, `mouseWheel` or `mouseMove`.
     */
    @Deprecated(message = "use mouseType", level = DeprecationLevel.HIDDEN)
    override var type: InputEventType

    @JsName("type")
    var mouseType: (MouseInputEventType)
    var x: Double
    var y: Double
}
