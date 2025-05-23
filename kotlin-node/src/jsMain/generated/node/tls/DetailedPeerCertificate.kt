package node.tls


sealed external interface DetailedPeerCertificate : PeerCertificate {
    /**
     * The issuer certificate object.
     * For self-signed certificates, this may be a circular reference.
     */
    var issuerCertificate: DetailedPeerCertificate
}
