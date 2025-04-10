// Automatically generated - do not modify!

@file:JsModule("node:net")

package node.net

import node.buffer.Buffer
import node.events.Event
import node.events.EventType
import node.stream.Duplex

open external class Socket : Duplex {
    constructor(options: SocketConstructorOpts = definedExternally)

    /**
     * Sends data on the socket. The second parameter specifies the encoding in the
     * case of a string. It defaults to UTF8 encoding.
     *
     * Returns `true` if the entire data was flushed successfully to the kernel
     * buffer. Returns `false` if all or part of the data was queued in user memory.`'drain'` will be emitted when the buffer is again free.
     *
     * The optional `callback` parameter will be executed when the data is finally
     * written out, which may not be immediately.
     *
     * See `Writable` stream `write()` method for more
     * information.
     * @since v0.1.90
     * @param [encoding='utf8'] Only used when data is `string`.
     */
    override fun write(
        chunk: Any, /* Uint8Array | string */
        callback: (error: Error?) -> Unit,
    ): Boolean

    override fun write(
        chunk: Any, /* Uint8Array | string */
        encoding: node.buffer.BufferEncoding,
        callback: (error: Error?) -> Unit,
    ): Boolean

    /**
     * Initiate a connection on a given socket.
     *
     * Possible signatures:
     *
     * * `socket.connect(options[, connectListener])`
     * * `socket.connect(path[, connectListener])` for `IPC` connections.
     * * `socket.connect(port[, host][, connectListener])` for TCP connections.
     * * Returns: `net.Socket` The socket itself.
     *
     * This function is asynchronous. When the connection is established, the `'connect'` event will be emitted. If there is a problem connecting,
     * instead of a `'connect'` event, an `'error'` event will be emitted with
     * the error passed to the `'error'` listener.
     * The last parameter `connectListener`, if supplied, will be added as a listener
     * for the `'connect'` event **once**.
     *
     * This function should only be used for reconnecting a socket after`'close'` has been emitted or otherwise it may lead to undefined
     * behavior.
     */
    open fun connect(
        options: SocketConnectOpts,
        connectionListener: () -> Unit = definedExternally,
    ) /* : this */

    open fun connect(
        port: Number,
        host: String,
        connectionListener: () -> Unit = definedExternally,
    ) /* : this */

    open fun connect(
        port: Number,
        connectionListener: () -> Unit = definedExternally,
    ) /* : this */

    open fun connect(
        path: String,
        connectionListener: () -> Unit = definedExternally,
    ) /* : this */

    /**
     * Set the encoding for the socket as a `Readable Stream`. See `readable.setEncoding()` for more information.
     * @since v0.1.90
     * @return The socket itself.
     */
    override fun setEncoding(encoding: node.buffer.BufferEncoding) /* : this */

    /**
     * Pauses the reading of data. That is, `'data'` events will not be emitted.
     * Useful to throttle back an upload.
     * @return The socket itself.
     */
    override fun pause() /* : this */

    /**
     * Close the TCP connection by sending an RST packet and destroy the stream.
     * If this TCP socket is in connecting status, it will send an RST packet
     * and destroy this TCP socket once it is connected. Otherwise, it will call
     * `socket.destroy` with an `ERR_SOCKET_CLOSED` Error. If this is not a TCP socket
     * (for example, a pipe), calling this method will immediately throw
     * an `ERR_INVALID_HANDLE_TYPE` Error.
     * @since v18.3.0
     * @return The socket itself.
     */
    open fun resetAndDestroy() /* : this */

    /**
     * Resumes reading after a call to `socket.pause()`.
     * @return The socket itself.
     */
    override fun resume() /* : this */

    /**
     * Sets the socket to timeout after `timeout` milliseconds of inactivity on
     * the socket. By default `net.Socket` do not have a timeout.
     *
     * When an idle timeout is triggered the socket will receive a `'timeout'` event but the connection will not be severed. The user must manually call `socket.end()` or `socket.destroy()` to
     * end the connection.
     *
     * ```js
     * socket.setTimeout(3000);
     * socket.on('timeout', () => {
     *   console.log('socket timeout');
     *   socket.end();
     * });
     * ```
     *
     * If `timeout` is 0, then the existing idle timeout is disabled.
     *
     * The optional `callback` parameter will be added as a one-time listener for the `'timeout'` event.
     * @since v0.1.90
     * @return The socket itself.
     */
    open fun setTimeout(
        timeout: Number,
        callback: () -> Unit = definedExternally,
    ) /* : this */

    /**
     * Enable/disable the use of Nagle's algorithm.
     *
     * When a TCP connection is created, it will have Nagle's algorithm enabled.
     *
     * Nagle's algorithm delays data before it is sent via the network. It attempts
     * to optimize throughput at the expense of latency.
     *
     * Passing `true` for `noDelay` or not passing an argument will disable Nagle's
     * algorithm for the socket. Passing `false` for `noDelay` will enable Nagle's
     * algorithm.
     * @since v0.1.90
     * @param [noDelay=true]
     * @return The socket itself.
     */
    open fun setNoDelay(noDelay: Boolean = definedExternally) /* : this */

    /**
     * Enable/disable keep-alive functionality, and optionally set the initial
     * delay before the first keepalive probe is sent on an idle socket.
     *
     * Set `initialDelay` (in milliseconds) to set the delay between the last
     * data packet received and the first keepalive probe. Setting `0` for`initialDelay` will leave the value unchanged from the default
     * (or previous) setting.
     *
     * Enabling the keep-alive functionality will set the following socket options:
     *
     * * `SO_KEEPALIVE=1`
     * * `TCP_KEEPIDLE=initialDelay`
     * * `TCP_KEEPCNT=10`
     * * `TCP_KEEPINTVL=1`
     * @since v0.1.92
     * @param [enable=false]
     * @param [initialDelay=0]
     * @return The socket itself.
     */
    open fun setKeepAlive(
        enable: Boolean = definedExternally,
        initialDelay: Number = definedExternally,
    ) /* : this */
    /**
     * Returns the bound `address`, the address `family` name and `port` of the
     * socket as reported by the operating system:`{ port: 12346, family: 'IPv4', address: '127.0.0.1' }`
     * @since v0.1.90
     */

    // HIDDEN METHOD START
    /*
    address(): AddressInfo | {}
    */
    // HIDDEN METHOD END

    /**
     * Calling `unref()` on a socket will allow the program to exit if this is the only
     * active socket in the event system. If the socket is already `unref`ed calling`unref()` again will have no effect.
     * @since v0.9.1
     * @return The socket itself.
     */
    open fun unref() /* : this */

    /**
     * Opposite of `unref()`, calling `ref()` on a previously `unref`ed socket will _not_ let the program exit if it's the only socket left (the default behavior).
     * If the socket is `ref`ed calling `ref` again will have no effect.
     * @since v0.9.1
     * @return The socket itself.
     */
    open fun ref() /* : this */

    /**
     * This property shows the number of characters buffered for writing. The buffer
     * may contain strings whose length after encoding is not yet known. So this number
     * is only an approximation of the number of bytes in the buffer.
     *
     * `net.Socket` has the property that `socket.write()` always works. This is to
     * help users get up and running quickly. The computer cannot always keep up
     * with the amount of data that is written to a socket. The network connection
     * simply might be too slow. Node.js will internally queue up the data written to a
     * socket and send it out over the wire when it is possible.
     *
     * The consequence of this internal buffering is that memory may grow.
     * Users who experience large or growing `bufferSize` should attempt to
     * "throttle" the data flows in their program with `socket.pause()` and `socket.resume()`.
     * @since v0.3.8
     * @deprecated Since v14.6.0 - Use `writableLength` instead.
     */
    open val bufferSize: Number

    /**
     * The amount of received bytes.
     * @since v0.5.3
     */
    open val bytesRead: Number

    /**
     * The amount of bytes sent.
     * @since v0.5.3
     */
    open val bytesWritten: Number

    /**
     * If `true`,`socket.connect(options[, connectListener])` was
     * called and has not yet finished. It will stay `true` until the socket becomes
     * connected, then it is set to `false` and the `'connect'` event is emitted. Note
     * that the `socket.connect(options[, connectListener])` callback is a listener for the `'connect'` event.
     * @since v6.1.0
     */
    open val connecting: Boolean

    /**
     * This is `true` if the socket is not connected yet, either because `.connect()`
     * has not yet been called or because it is still in the process of connecting (see `socket.connecting`).
     * @since v10.16.0
     */
    open val pending: Boolean

    /**
     * See `writable.destroyed` for further details.
     */
    override var /* val */ destroyed: Boolean

    /**
     * The string representation of the local IP address the remote client is
     * connecting on. For example, in a server listening on `'0.0.0.0'`, if a client
     * connects on `'192.168.1.1'`, the value of `socket.localAddress` would be`'192.168.1.1'`.
     * @since v0.9.6
     */
    open val localAddress: String?

    /**
     * The numeric representation of the local port. For example, `80` or `21`.
     * @since v0.9.6
     */
    open val localPort: Number?

    /**
     * The string representation of the local IP family. `'IPv4'` or `'IPv6'`.
     * @since v18.8.0
     */
    open val localFamily: String?

    /**
     * This property represents the state of the connection as a string.
     * @see {https://nodejs.org/api/net.html#socketreadystate}
     * @since v0.5.0
     */
    open val readyState: SocketReadyState

    /**
     * The string representation of the remote IP address. For example,`'74.125.127.100'` or `'2001:4860:a005::68'`. Value may be `undefined` if
     * the socket is destroyed (for example, if the client disconnected).
     * @since v0.5.10
     */
    open val remoteAddress: String?

    /**
     * The string representation of the remote IP family. `'IPv4'` or `'IPv6'`.
     * @since v0.11.14
     */
    open val remoteFamily: String?

    /**
     * The numeric representation of the remote port. For example, `80` or `21`.
     * @since v0.5.10
     */
    open val remotePort: Number?

    /**
     * The socket timeout in milliseconds as set by socket.setTimeout(). It is undefined if a timeout has not been set.
     * @since v10.7.0
     */
    open val timeout: Number?

    /**
     * Half-closes the socket. i.e., it sends a FIN packet. It is possible the
     * server will still send some data.
     *
     * See `writable.end()` for further details.
     * @since v0.1.90
     * @param [encoding='utf8'] Only used when data is `string`.
     * @param callback Optional callback for when the socket is finished.
     * @return The socket itself.
     */
    override fun end(callback: () -> Unit) /* : this */
    override fun end(
        chunk: Any, /* Uint8Array | string */
        callback: () -> Unit,
    ) /* : this */

    override fun end(
        chunk: Any, /* Uint8Array | string */
        encoding: node.buffer.BufferEncoding,
        callback: () -> Unit,
    ) /* : this */

    /**
     * events.EventEmitter
     *   1. close
     *   2. connect
     *   3. data
     *   4. drain
     *   5. end
     *   6. error
     *   7. lookup
     *   8. ready
     *   9. timeout
     */
    override fun addListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    open fun addListener(
        event: Event.CLOSE,
        listener: (hadError: Boolean) -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.CONNECT,
        listener: () -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.DATA,
        listener: (data: Buffer) -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.LOOKUP,
        listener: (
            error: Error,
            address: String,
            family: Any, /* string | number */
            host: String,
        ) -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.READY,
        listener: () -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.TIMEOUT,
        listener: () -> Unit,
    ) /* : this */

    override fun emit(
        event: EventType,
        vararg args: Any,
    ): Boolean

    open fun emit(
        event: Event.CLOSE,
        hadError: Boolean,
    ): Boolean

    open fun emit(event: Event.CONNECT): Boolean
    open fun emit(
        event: Event.DATA,
        data: Buffer,
    ): Boolean

    override fun emit(event: Event.DRAIN): Boolean
    override fun emit(event: Event.END): Boolean
    override fun emit(
        event: Event.ERROR,
        err: Error,
    ): Boolean

    open fun emit(
        event: Event.LOOKUP,
        err: Error,
        address: String,
        family: Any, /* string | number */
        host: String,
    ): Boolean

    open fun emit(event: Event.READY): Boolean
    open fun emit(event: Event.TIMEOUT): Boolean
    override fun on(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    open fun on(
        event: Event.CLOSE,
        listener: (hadError: Boolean) -> Unit,
    ) /* : this */

    open fun on(
        event: Event.CONNECT,
        listener: () -> Unit,
    ) /* : this */

    open fun on(
        event: Event.DATA,
        listener: (data: Buffer) -> Unit,
    ) /* : this */

    override fun on(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun on(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    override fun on(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun on(
        event: Event.LOOKUP,
        listener: (
            error: Error,
            address: String,
            family: Any, /* string | number */
            host: String,
        ) -> Unit,
    ) /* : this */

    open fun on(
        event: Event.READY,
        listener: () -> Unit,
    ) /* : this */

    open fun on(
        event: Event.TIMEOUT,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    open fun once(
        event: Event.CLOSE,
        listener: (hadError: Boolean) -> Unit,
    ) /* : this */

    open fun once(
        event: Event.CONNECT,
        listener: () -> Unit,
    ) /* : this */

    open fun once(
        event: Event.DATA,
        listener: (data: Buffer) -> Unit,
    ) /* : this */

    override fun once(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun once(
        event: Event.LOOKUP,
        listener: (
            error: Error,
            address: String,
            family: Any, /* string | number */
            host: String,
        ) -> Unit,
    ) /* : this */

    open fun once(
        event: Event.READY,
        listener: () -> Unit,
    ) /* : this */

    open fun once(
        event: Event.TIMEOUT,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    open fun prependListener(
        event: Event.CLOSE,
        listener: (hadError: Boolean) -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.CONNECT,
        listener: () -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.DATA,
        listener: (data: Buffer) -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.LOOKUP,
        listener: (
            error: Error,
            address: String,
            family: Any, /* string | number */
            host: String,
        ) -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.READY,
        listener: () -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.TIMEOUT,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.CLOSE,
        listener: (hadError: Boolean) -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.CONNECT,
        listener: () -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.DATA,
        listener: (data: Buffer) -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.LOOKUP,
        listener: (
            error: Error,
            address: String,
            family: Any, /* string | number */
            host: String,
        ) -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.READY,
        listener: () -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.TIMEOUT,
        listener: () -> Unit,
    ) /* : this */
}
