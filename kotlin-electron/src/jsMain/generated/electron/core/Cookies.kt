@file:JsModule("INTERNAL_ENTITY")

package electron.core

import kotlin.js.Promise
import node.events.EventEmitter as NodeEventEmitter


external class Cookies : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/cookies
    /**
     * Emitted when a cookie is changed because it was added, edited, removed, or
     * expired.
     */
    fun on(
        event: CookiesEvent.CHANGED, listener: (
            event: Event,
            /**
             * The cookie that was changed.
             */
            cookie: Cookie,
            /**
             * The cause of the change with one of the following values:
             */
            cause: (CookiesOnListenerCause),
            /**
             * `true` if the cookie was removed, `false` otherwise.
             */
            removed: Boolean
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: CookiesEvent.CHANGED, listener: (
            event: Event,
            /**
             * The cookie that was changed.
             */
            cookie: Cookie,
            /**
             * The cause of the change with one of the following values:
             */
            cause: (CookiesOnceListenerCause),
            /**
             * `true` if the cookie was removed, `false` otherwise.
             */
            removed: Boolean
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: CookiesEvent.CHANGED, listener: (
            event: Event,
            /**
             * The cookie that was changed.
             */
            cookie: Cookie,
            /**
             * The cause of the change with one of the following values:
             */
            cause: (CookiesAddListenerListenerCause),
            /**
             * `true` if the cookie was removed, `false` otherwise.
             */
            removed: Boolean
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: CookiesEvent.CHANGED, listener: (
            event: Event,
            /**
             * The cookie that was changed.
             */
            cookie: Cookie,
            /**
             * The cause of the change with one of the following values:
             */
            cause: (CookiesRemoveListenerListenerCause),
            /**
             * `true` if the cookie was removed, `false` otherwise.
             */
            removed: Boolean
        ) -> Unit
    ): Unit /* this */

    /**
     * A promise which resolves when the cookie store has been flushed
     *
     * Writes any unwritten cookies data to disk.
     */
    fun flushStore(): Promise<Unit>

    /**
     * A promise which resolves an array of cookie objects.
     *
     * Sends a request to get all cookies matching `filter`, and resolves a promise
     * with the response.
     */
    fun get(filter: CookiesGetFilter): Promise<js.core.ReadonlyArray<Cookie>>

    /**
     * A promise which resolves when the cookie has been removed
     *
     * Removes the cookies matching `url` and `name`
     */
    fun remove(url: String, name: String): Promise<Unit>

    /**
     * A promise which resolves when the cookie has been set
     *
     * Sets a cookie with `details`.
     */
    fun set(details: CookiesSetDetails): Promise<Unit>
}
