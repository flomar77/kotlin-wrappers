package node.tls


sealed external interface CipherNameAndProtocol {
    /**
     * The cipher name.
     */
    var name: String

    /**
     * SSL/TLS protocol version.
     */
    var version: String

    /**
     * IETF name for the cipher suite.
     */
    var standardName: String
}
