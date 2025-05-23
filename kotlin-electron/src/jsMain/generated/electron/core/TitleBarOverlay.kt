package electron.core


external interface TitleBarOverlay {
    /**
     * The CSS color of the Window Controls Overlay when enabled. Default is the system
     * color.
     *
     * @platform win32
     */
    var color: String?

    /**
     * The CSS color of the symbols on the Window Controls Overlay when enabled.
     * Default is the system color.
     *
     * @platform win32
     */
    var symbolColor: String?

    /**
     * The height of the title bar and Window Controls Overlay in pixels. Default is
     * system height.
     *
     * @platform darwin,win32
     */
    var height: Double?
}
