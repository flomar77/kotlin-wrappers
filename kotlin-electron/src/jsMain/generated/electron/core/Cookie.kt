package electron.core


external interface Cookie {
// Docs: https://electronjs.org/docs/api/structures/cookie
    /**
     * The domain of the cookie; this will be normalized with a preceding dot so that
     * it's also valid for subdomains.
     */
    var domain: String?

    /**
     * The expiration date of the cookie as the number of seconds since the UNIX epoch.
     * Not provided for session cookies.
     */
    var expirationDate: Double?

    /**
     * Whether the cookie is a host-only cookie; this will only be `true` if no domain
     * was passed.
     */
    var hostOnly: Boolean?

    /**
     * Whether the cookie is marked as HTTP only.
     */
    var httpOnly: Boolean?

    /**
     * The name of the cookie.
     */
    var name: String

    /**
     * The path of the cookie.
     */
    var path: String?

    /**
     * The Same Site policy applied to this cookie.  Can be `unspecified`,
     * `no_restriction`, `lax` or `strict`.
     */
    var sameSite: (CookieSameSite)

    /**
     * Whether the cookie is marked as secure.
     */
    var secure: Boolean?

    /**
     * Whether the cookie is a session cookie or a persistent cookie with an expiration
     * date.
     */
    var session: Boolean?

    /**
     * The value of the cookie.
     */
    var value: String
}
