package electron.core


external interface LaunchItems {
    /**
     * name value of a registry entry.
     *
     * @platform win32
     */
    var name: String

    /**
     * The executable to an app that corresponds to a registry entry.
     *
     * @platform win32
     */
    var path: String

    /**
     * the command-line arguments to pass to the executable.
     *
     * @platform win32
     */
    var args: js.core.ReadonlyArray<String>

    /**
     * one of `user` or `machine`. Indicates whether the registry entry is under
     * `HKEY_CURRENT USER` or `HKEY_LOCAL_MACHINE`.
     *
     * @platform win32
     */
    var scope: String

    /**
     * `true` if the app registry key is startup approved and therefore shows as
     * `enabled` in Task Manager and Windows settings.
     *
     * @platform win32
     */
    var enabled: Boolean
}
