package electron.core


external interface Info {
    /**
     * Security origin for the isolated world.
     */
    var securityOrigin: String?

    /**
     * Content Security Policy for the isolated world.
     */
    var csp: String?

    /**
     * Name for isolated world. Useful in devtools.
     */
    var name: String?
}
