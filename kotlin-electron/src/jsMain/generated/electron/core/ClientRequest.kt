@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.buffer.Buffer
import node.events.EventEmitter as NodeEventEmitter


external class ClientRequest : NodeEventEmitter {
    /**
     * ClientRequest
     */
    constructor (options: ClientRequestConstructorOptions)

    constructor (options: String)
// Docs: https://electronjs.org/docs/api/client-request
    /**
     * Emitted when the `request` is aborted. The `abort` event will not be fired if
     * the `request` is already closed.
     */
    fun on(event: ClientRequestEvent.ABORT, listener: Function<*>): Unit /* this */

    /**
     * Emitted as the last event in the HTTP request-response transaction. The `close`
     * event indicates that no more events will be emitted on either the `request` or
     * `response` objects.
     */
    fun on(event: ClientRequestEvent.CLOSE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the `net` module fails to issue a network request. Typically when
     * the `request` object emits an `error` event, a `close` event will subsequently
     * follow and no response object will be provided.
     */
    fun on(
        event: ClientRequestEvent.ERROR, listener: (
            /**
             * an error object providing some information about the failure.
             */
            error: Throwable /* JsError */
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted just after the last chunk of the `request`'s data has been written into
     * the `request` object.
     */
    fun on(event: ClientRequestEvent.FINISH, listener: Function<*>): Unit /* this */

    /**
     * Emitted when an authenticating proxy is asking for user credentials.
     *
     * The `callback` function is expected to be called back with user credentials:
     *
     * * `username` string
     * * `password` string
     *
     * Providing empty credentials will cancel the request and report an authentication
     * error on the response object:
     */
    fun on(
        event: ClientRequestEvent.LOGIN,
        listener: (authInfo: AuthInfo, callback: (username: String? /* use undefined for default */, password: String? /* use undefined for default */) -> Unit) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the server returns a redirect response (e.g. 301 Moved
     * Permanently). Calling `request.followRedirect` will continue with the
     * redirection.  If this event is handled, `request.followRedirect` must be called
     * **synchronously**, otherwise the request will be cancelled.
     */
    fun on(
        event: ClientRequestEvent.REDIRECT,
        listener: (statusCode: Double, method: String, redirectUrl: String, responseHeaders: js.core.ReadonlyRecord<String, js.core.ReadonlyArray<String>>) -> Unit
    ): Unit /* this */

    fun on(
        event: ClientRequestEvent.RESPONSE, listener: (
            /**
             * An object representing the HTTP response message.
             */
            response: IncomingMessage
        ) -> Unit
    ): Unit /* this */

    fun once(event: ClientRequestEvent.ABORT, listener: Function<*>): Unit /* this */
    fun once(event: ClientRequestEvent.CLOSE, listener: Function<*>): Unit /* this */
    fun once(
        event: ClientRequestEvent.ERROR, listener: (
            /**
             * an error object providing some information about the failure.
             */
            error: Throwable /* JsError */
        ) -> Unit
    ): Unit /* this */

    fun once(event: ClientRequestEvent.FINISH, listener: Function<*>): Unit /* this */
    fun once(
        event: ClientRequestEvent.LOGIN,
        listener: (authInfo: AuthInfo, callback: (username: String? /* use undefined for default */, password: String? /* use undefined for default */) -> Unit) -> Unit
    ): Unit /* this */

    fun once(
        event: ClientRequestEvent.REDIRECT,
        listener: (statusCode: Double, method: String, redirectUrl: String, responseHeaders: js.core.ReadonlyRecord<String, js.core.ReadonlyArray<String>>) -> Unit
    ): Unit /* this */

    fun once(
        event: ClientRequestEvent.RESPONSE, listener: (
            /**
             * An object representing the HTTP response message.
             */
            response: IncomingMessage
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: ClientRequestEvent.ABORT, listener: Function<*>): Unit /* this */
    fun addListener(event: ClientRequestEvent.CLOSE, listener: Function<*>): Unit /* this */
    fun addListener(
        event: ClientRequestEvent.ERROR, listener: (
            /**
             * an error object providing some information about the failure.
             */
            error: Throwable /* JsError */
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: ClientRequestEvent.FINISH, listener: Function<*>): Unit /* this */
    fun addListener(
        event: ClientRequestEvent.LOGIN,
        listener: (authInfo: AuthInfo, callback: (username: String? /* use undefined for default */, password: String? /* use undefined for default */) -> Unit) -> Unit
    ): Unit /* this */

    fun addListener(
        event: ClientRequestEvent.REDIRECT,
        listener: (statusCode: Double, method: String, redirectUrl: String, responseHeaders: js.core.ReadonlyRecord<String, js.core.ReadonlyArray<String>>) -> Unit
    ): Unit /* this */

    fun addListener(
        event: ClientRequestEvent.RESPONSE, listener: (
            /**
             * An object representing the HTTP response message.
             */
            response: IncomingMessage
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: ClientRequestEvent.ABORT, listener: Function<*>): Unit /* this */
    fun removeListener(event: ClientRequestEvent.CLOSE, listener: Function<*>): Unit /* this */
    fun removeListener(
        event: ClientRequestEvent.ERROR, listener: (
            /**
             * an error object providing some information about the failure.
             */
            error: Throwable /* JsError */
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: ClientRequestEvent.FINISH, listener: Function<*>): Unit /* this */
    fun removeListener(
        event: ClientRequestEvent.LOGIN,
        listener: (authInfo: AuthInfo, callback: (username: String? /* use undefined for default */, password: String? /* use undefined for default */) -> Unit) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: ClientRequestEvent.REDIRECT,
        listener: (statusCode: Double, method: String, redirectUrl: String, responseHeaders: js.core.ReadonlyRecord<String, js.core.ReadonlyArray<String>>) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: ClientRequestEvent.RESPONSE, listener: (
            /**
             * An object representing the HTTP response message.
             */
            response: IncomingMessage
        ) -> Unit
    ): Unit /* this */

    /**
     * Cancels an ongoing HTTP transaction. If the request has already emitted the
     * `close` event, the abort operation will have no effect. Otherwise an ongoing
     * event will emit `abort` and `close` events. Additionally, if there is an ongoing
     * response object,it will emit the `aborted` event.
     */
    fun abort(): Unit

    /**
     * Sends the last chunk of the request data. Subsequent write or end operations
     * will not be allowed. The `finish` event is emitted just after the end operation.
     */
    fun end(chunk: String = definedExternally, encoding: String = definedExternally, callback: () -> Unit = definedExternally): Unit

    fun end(chunk: Buffer = definedExternally, encoding: String = definedExternally, callback: () -> Unit = definedExternally): Unit

    /**
     * Continues any pending redirection. Can only be called during a `'redirect'`
     * event.
     */
    fun followRedirect(): Unit

    /**
     * The value of a previously set extra header name.
     */
    fun getHeader(name: String): String

    /**
     * * `active` boolean - Whether the request is currently active. If this is false
     * no other properties will be set
     * * `started` boolean - Whether the upload has started. If this is false both
     * `current` and `total` will be set to 0.
     * * `current` Integer - The number of bytes that have been uploaded so far
     * * `total` Integer - The number of bytes that will be uploaded this request
     *
     * You can use this method in conjunction with `POST` requests to get the progress
     * of a file upload or other data transfer.
     */
    fun getUploadProgress(): UploadProgress

    /**
     * Removes a previously set extra header name. This method can be called only
     * before first write. Trying to call it after the first write will throw an error.
     */
    fun removeHeader(name: String): Unit

    /**
     * Adds an extra HTTP header. The header name will be issued as-is without
     * lowercasing. It can be called only before first write. Calling this method after
     * the first write will throw an error. If the passed value is not a `string`, its
     * `toString()` method will be called to obtain the final value.
     *
     * Certain headers are restricted from being set by apps. These headers are listed
     * below. More information on restricted headers can be found in Chromium's header
     * utils.
     *
     * * `Content-Length`
     * * `Host`
     * * `Trailer` or `Te`
     * * `Upgrade`
     * * `Cookie2`
     * * `Keep-Alive`
     * * `Transfer-Encoding`
     *
     * Additionally, setting the `Connection` header to the value `upgrade` is also
     * disallowed.
     */
    fun setHeader(name: String, value: String): Unit

    /**
     * `callback` is essentially a dummy function introduced in the purpose of keeping
     * similarity with the Node.js API. It is called asynchronously in the next tick
     * after `chunk` content have been delivered to the Chromium networking layer.
     * Contrary to the Node.js implementation, it is not guaranteed that `chunk`
     * content have been flushed on the wire before `callback` is called.
     *
     * Adds a chunk of data to the request body. The first write operation may cause
     * the request headers to be issued on the wire. After the first write operation,
     * it is not allowed to add or remove a custom header.
     */
    fun write(chunk: String, encoding: String = definedExternally, callback: () -> Unit = definedExternally): Unit

    fun write(chunk: Buffer, encoding: String = definedExternally, callback: () -> Unit = definedExternally): Unit

    /**
     * A `boolean` specifying whether the request will use HTTP chunked transfer
     * encoding or not. Defaults to false. The property is readable and writable,
     * however it can be set only before the first write operation as the HTTP headers
     * are not yet put on the wire. Trying to set the `chunkedEncoding` property after
     * the first write will throw an error.
     *
     * Using chunked encoding is strongly recommended if you need to send a large
     * request body as data will be streamed in small chunks instead of being
     * internally buffered inside Electron process memory.
     */
    var chunkedEncoding: Boolean
}
