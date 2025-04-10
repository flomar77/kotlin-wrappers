package electron.core


external interface Input {
    /**
     * Either `keyUp` or `keyDown`.
     */
    var type: String

    /**
     * Equivalent to KeyboardEvent.key.
     */
    var key: String

    /**
     * Equivalent to KeyboardEvent.code.
     */
    var code: String

    /**
     * Equivalent to KeyboardEvent.repeat.
     */
    var isAutoRepeat: Boolean

    /**
     * Equivalent to KeyboardEvent.isComposing.
     */
    var isComposing: Boolean

    /**
     * Equivalent to KeyboardEvent.shiftKey.
     */
    var shift: Boolean

    /**
     * Equivalent to KeyboardEvent.controlKey.
     */
    var control: Boolean

    /**
     * Equivalent to KeyboardEvent.altKey.
     */
    var alt: Boolean

    /**
     * Equivalent to KeyboardEvent.metaKey.
     */
    var meta: Boolean

    /**
     * Equivalent to KeyboardEvent.location.
     */
    var location: Double

    /**
     * See InputEvent.modifiers.
     */
    var modifiers: js.core.ReadonlyArray<String>
}
