package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{clipboardRead: 'clipboard-read', clipboardSanitizedWrite: 'clipboard-sanitized-write', media: 'media', displayCapture: 'display-capture', mediaKeySystem: 'mediaKeySystem', geolocation: 'geolocation', notifications: 'notifications', midi: 'midi', midiSysex: 'midiSysex', pointerLock: 'pointerLock', fullscreen: 'fullscreen', openExternal: 'openExternal', windowManagement: 'window-management', unknown: 'unknown'}/*union*/)""")
sealed external interface Temp0 {
    companion object {
        val clipboardRead: Temp0
        val clipboardSanitizedWrite: Temp0
        val media: Temp0
        val displayCapture: Temp0
        val mediaKeySystem: Temp0
        val geolocation: Temp0
        val notifications: Temp0
        val midi: Temp0
        val midiSysex: Temp0
        val pointerLock: Temp0
        val fullscreen: Temp0
        val openExternal: Temp0
        val windowManagement: Temp0
        val unknown: Temp0
    }
}
