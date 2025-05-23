@file:JsModule("node:tls")

package node.tls


/**
 * {@link createServer} sets the default value of the `honorCipherOrder` option
 * to `true`, other APIs that create secure contexts leave it unset.
 *
 * {@link createServer} uses a 128 bit truncated SHA1 hash value generated
 * from `process.argv` as the default value of the `sessionIdContext` option, other
 * APIs that create secure contexts have no default value.
 *
 * The `tls.createSecureContext()` method creates a `SecureContext` object. It is
 * usable as an argument to several `tls` APIs, such as {@link createServer} and `server.addContext()`, but has no public methods.
 *
 * A key is _required_ for ciphers that use certificates. Either `key` or`pfx` can be used to provide it.
 *
 * If the `ca` option is not given, then Node.js will default to using [Mozilla's publicly trusted list of
     * CAs](https://hg.mozilla.org/mozilla-central/raw-file/tip/security/nss/lib/ckfw/builtins/certdata.txt).
 * @since v0.11.13
 */
external fun createSecureContext(options: SecureContextOptions = definedExternally): SecureContext
