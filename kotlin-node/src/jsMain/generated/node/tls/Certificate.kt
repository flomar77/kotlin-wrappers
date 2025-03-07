package node.tls


sealed external interface Certificate {
    /**
     * Country code.
     */
    var C: String

    /**
     * Street.
     */
    var ST: String

    /**
     * Locality.
     */
    var L: String

    /**
     * Organization.
     */
    var O: String

    /**
     * Organizational unit.
     */
    var OU: String

    /**
     * Common name.
     */
    var CN: String
}
