package electron.core


external interface BrowserWindowConstructorOptions {
    /**
     * Window's width in pixels. Default is `800`.
     */
    var width: Double?

    /**
     * Window's height in pixels. Default is `600`.
     */
    var height: Double?

    /**
     * (**required** if y is used) Window's left offset from screen. Default is to
     * center the window.
     */
    var x: Double?

    /**
     * (**required** if x is used) Window's top offset from screen. Default is to
     * center the window.
     */
    var y: Double?

    /**
     * The `width` and `height` would be used as web page's size, which means the
     * actual window's size will include window frame's size and be slightly larger.
     * Default is `false`.
     */
    var useContentSize: Boolean?

    /**
     * Show window in the center of the screen. Default is `false`.
     */
    var center: Boolean?

    /**
     * Window's minimum width. Default is `0`.
     */
    var minWidth: Double?

    /**
     * Window's minimum height. Default is `0`.
     */
    var minHeight: Double?

    /**
     * Window's maximum width. Default is no limit.
     */
    var maxWidth: Double?

    /**
     * Window's maximum height. Default is no limit.
     */
    var maxHeight: Double?

    /**
     * Whether window is resizable. Default is `true`.
     */
    var resizable: Boolean?

    /**
     * Whether window is movable. This is not implemented on Linux. Default is `true`.
     *
     * @platform darwin,win32
     */
    var movable: Boolean?

    /**
     * Whether window is minimizable. This is not implemented on Linux. Default is
     * `true`.
     *
     * @platform darwin,win32
     */
    var minimizable: Boolean?

    /**
     * Whether window is maximizable. This is not implemented on Linux. Default is
     * `true`.
     *
     * @platform darwin,win32
     */
    var maximizable: Boolean?

    /**
     * Whether window is closable. This is not implemented on Linux. Default is `true`.
     *
     * @platform darwin,win32
     */
    var closable: Boolean?

    /**
     * Whether the window can be focused. Default is `true`. On Windows setting
     * `focusable: false` also implies setting `skipTaskbar: true`. On Linux setting
     * `focusable: false` makes the window stop interacting with wm, so the window will
     * always stay on top in all workspaces.
     */
    var focusable: Boolean?

    /**
     * Whether the window should always stay on top of other windows. Default is
     * `false`.
     */
    var alwaysOnTop: Boolean?

    /**
     * Whether the window should show in fullscreen. When explicitly set to `false` the
     * fullscreen button will be hidden or disabled on macOS. Default is `false`.
     */
    var fullscreen: Boolean?

    /**
     * Whether the window can be put into fullscreen mode. On macOS, also whether the
     * maximize/zoom button should toggle full screen mode or maximize window. Default
     * is `true`.
     */
    var fullscreenable: Boolean?

    /**
     * Use pre-Lion fullscreen on macOS. Default is `false`.
     *
     * @platform darwin
     */
    var simpleFullscreen: Boolean?

    /**
     * Whether to show the window in taskbar. Default is `false`.
     *
     * @platform darwin,win32
     */
    var skipTaskbar: Boolean?

    /**
     * Whether window should be hidden when the user toggles into mission control.
     *
     * @platform darwin
     */
    var hiddenInMissionControl: Boolean?

    /**
     * Whether the window is in kiosk mode. Default is `false`.
     */
    var kiosk: Boolean?

    /**
     * Default window title. Default is `"Electron"`. If the HTML tag `<title>` is
     * defined in the HTML file loaded by `loadURL()`, this property will be ignored.
     */
    var title: String?

    /**
     * The window icon. On Windows it is recommended to use `ICO` icons to get best
     * visual effects, you can also leave it undefined so the executable's icon will be
     * used.
     */
    var icon: (Any /* (NativeImage) | (string) */)?

    /**
     * Whether window should be shown when created. Default is `true`.
     */
    var show: Boolean?

    /**
     * Whether the renderer should be active when `show` is `false` and it has just
     * been created.  In order for `document.visibilityState` to work correctly on
     * first load with `show: false` you should set this to `false`.  Setting this to
     * `false` will cause the `ready-to-show` event to not fire.  Default is `true`.
     */
    var paintWhenInitiallyHidden: Boolean?

    /**
     * Specify `false` to create a frameless window. Default is `true`.
     */
    var frame: Boolean?

    /**
     * Specify parent window. Default is `null`.
     */
    var parent: BrowserWindow?

    /**
     * Whether this is a modal window. This only works when the window is a child
     * window. Default is `false`.
     */
    var modal: Boolean?

    /**
     * Whether clicking an inactive window will also click through to the web contents.
     * Default is `false` on macOS. This option is not configurable on other platforms.
     *
     * @platform darwin
     */
    var acceptFirstMouse: Boolean?

    /**
     * Whether to hide cursor when typing. Default is `false`.
     */
    var disableAutoHideCursor: Boolean?

    /**
     * Auto hide the menu bar unless the `Alt` key is pressed. Default is `false`.
     */
    var autoHideMenuBar: Boolean?

    /**
     * Enable the window to be resized larger than screen. Only relevant for macOS, as
     * other OSes allow larger-than-screen windows by default. Default is `false`.
     *
     * @platform darwin
     */
    var enableLargerThanScreen: Boolean?

    /**
     * The window's background color in Hex, RGB, RGBA, HSL, HSLA or named CSS color
     * format. Alpha in #AARRGGBB format is supported if `transparent` is set to
     * `true`. Default is `#FFF` (white). See win.setBackgroundColor for more
     * information.
     */
    var backgroundColor: String?

    /**
     * Whether window should have a shadow. Default is `true`.
     */
    var hasShadow: Boolean?

    /**
     * Set the initial opacity of the window, between 0.0 (fully transparent) and 1.0
     * (fully opaque). This is only implemented on Windows and macOS.
     *
     * @platform darwin,win32
     */
    var opacity: Double?

    /**
     * Forces using dark theme for the window, only works on some GTK+3 desktop
     * environments. Default is `false`.
     */
    var darkTheme: Boolean?

    /**
     * Makes the window transparent. Default is `false`. On Windows, does not work
     * unless the window is frameless.
     */
    var transparent: Boolean?

    /**
     * The type of window, default is normal window. See more about this below.
     */
    var type: String?

    /**
     * Specify how the material appearance should reflect window activity state on
     * macOS. Must be used with the `vibrancy` property. Possible values are:
     *
     * @platform darwin
     */
    var visualEffectState: (BrowserWindowConstructorOptionsVisualEffectState)?

    /**
     * The style of window title bar. Default is `default`. Possible values are:
     *
     * @platform darwin,win32
     */
    var titleBarStyle: (BrowserWindowConstructorOptionsTitleBarStyle)?

    /**
     * Set a custom position for the traffic light buttons in frameless windows.
     *
     * @platform darwin
     */
    var trafficLightPosition: Point?

    /**
     * Whether frameless window should have rounded corners on macOS. Default is
     * `true`. Setting this property to `false` will prevent the window from being
     * fullscreenable.
     *
     * @platform darwin
     */
    var roundedCorners: Boolean?

    /**
     * Shows the title in the title bar in full screen mode on macOS for `hiddenInset`
     * titleBarStyle. Default is `false`.
     *
     * @deprecated
     * @platform darwin
     */
    var fullscreenWindowTitle: Boolean?

    /**
     * Use `WS_THICKFRAME` style for frameless windows on Windows, which adds standard
     * window frame. Setting it to `false` will remove window shadow and window
     * animations. Default is `true`.
     */
    var thickFrame: Boolean?

    /**
     * Add a type of vibrancy effect to the window, only on macOS. Can be
     * `appearance-based`, `light`, `dark`, `titlebar`, `selection`, `menu`, `popover`,
     * `sidebar`, `medium-light`, `ultra-dark`, `header`, `sheet`, `window`, `hud`,
     * `fullscreen-ui`, `tooltip`, `content`, `under-window`, or `under-page`. Please
     * note that `appearance-based`, `light`, `dark`, `medium-light`, and `ultra-dark`
     * are deprecated and have been removed in macOS Catalina (10.15).
     *
     * @platform darwin
     */
    var vibrancy: (BrowserWindowConstructorOptionsVibrancy)?

    /**
     * Set the window's system-drawn background material, including behind the
     * non-client area. Can be `auto`, `none`, `mica`, `acrylic` or `tabbed`. See
     * win.setBackgroundMaterial for more information.
     *
     * @platform win32
     */
    var backgroundMaterial: (BrowserWindowConstructorOptionsBackgroundMaterial)?

    /**
     * Controls the behavior on macOS when option-clicking the green stoplight button
     * on the toolbar or by clicking the Window > Zoom menu item. If `true`, the window
     * will grow to the preferred width of the web page when zoomed, `false` will cause
     * it to zoom to the width of the screen. This will also affect the behavior when
     * calling `maximize()` directly. Default is `false`.
     *
     * @platform darwin
     */
    var zoomToPageWidth: Boolean?

    /**
     * Tab group name, allows opening the window as a native tab. Windows with the same
     * tabbing identifier will be grouped together. This also adds a native new tab
     * button to your window's tab bar and allows your `app` and window to receive the
     * `new-window-for-tab` event.
     *
     * @platform darwin
     */
    var tabbingIdentifier: String?

    /**
     * Settings of web page's features.
     */
    var webPreferences: WebPreferences?

    /**
     *  When using a frameless window in conjunction with
     * `win.setWindowButtonVisibility(true)` on macOS or using a `titleBarStyle` so
     * that the standard window controls ("traffic lights" on macOS) are visible, this
     * property enables the Window Controls Overlay JavaScript APIs and CSS Environment
     * Variables. Specifying `true` will result in an overlay with default system
     * colors. Default is `false`.
     */
    var titleBarOverlay: (Any /* (TitleBarOverlay) | (boolean) */)?
}
