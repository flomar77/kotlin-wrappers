package electron.core


external interface CertificateTrustDialogOptions {
    /**
     * The certificate to trust/import.
     */
    var certificate: Certificate

    /**
     * The message to display to the user.
     */
    var message: String
}
