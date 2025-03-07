package electron.core


external interface SSLConfigConfig {
    /**
     * Can be `tls1`, `tls1.1`, `tls1.2` or `tls1.3`. The minimum SSL version to allow
     * when connecting to remote servers. Defaults to `tls1`.
     */
    var minVersion: String?

    /**
     * Can be `tls1.2` or `tls1.3`. The maximum SSL version to allow when connecting to
     * remote servers. Defaults to `tls1.3`.
     */
    var maxVersion: String?

    /**
     * List of cipher suites which should be explicitly prevented from being used in
     * addition to those disabled by the net built-in policy. Supported literal forms:
     * 0xAABB, where AA is `cipher_suite[0]` and BB is `cipher_suite[1]`, as defined in
     * RFC 2246, Section 7.4.1.2. Unrecognized but parsable cipher suites in this form
     * will not return an error. Ex: To disable TLS_RSA_WITH_RC4_128_MD5, specify
     * 0x0004, while to disable TLS_ECDH_ECDSA_WITH_RC4_128_SHA, specify 0xC002. Note
     * that TLSv1.3 ciphers cannot be disabled using this mechanism.
     */
    var disabledCipherSuites: js.core.ReadonlyArray<Double>?
}
