// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

import node.ErrnoException
import node.events.Event
import node.events.EventType
import node.stream.Readable
import node.stream.Writable

external class WriteStream : Writable {
    /**
     * Closes `writeStream`. Optionally accepts a
     * callback that will be executed once the `writeStream`is closed.
     * @since v0.9.4
     */
    fun close(callback: (error: ErrnoException?) -> Unit = definedExternally)

    /**
     * The number of bytes written so far. Does not include data that is still queued
     * for writing.
     * @since v0.4.7
     */
    var bytesWritten: Number

    /**
     * The path to the file the stream is writing to as specified in the first
     * argument to {@link createWriteStream}. If `path` is passed as a string, then`writeStream.path` will be a string. If `path` is passed as a `Buffer`, then`writeStream.path` will be a
     * `Buffer`.
     * @since v0.1.93
     */
    var path: Any /* string | Buffer */

    /**
     * This property is `true` if the underlying file has not been opened yet,
     * i.e. before the `'ready'` event is emitted.
     * @since v11.2.0
     */
    var pending: Boolean

    /**
     * events.EventEmitter
     *   1. open
     *   2. close
     *   3. ready
     */
    override fun addListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    fun addListener(
        event: Event.OPEN,
        listener: (fd: Number) -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    fun addListener(
        event: Event.READY,
        listener: () -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun addListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    override fun on(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun on(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun on(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    override fun on(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    fun on(
        event: Event.OPEN,
        listener: (fd: Number) -> Unit,
    ) /* : this */

    override fun on(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    fun on(
        event: Event.READY,
        listener: () -> Unit,
    ) /* : this */

    override fun on(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun on(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    override fun once(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    override fun once(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    fun once(
        event: Event.OPEN,
        listener: (fd: Number) -> Unit,
    ) /* : this */

    override fun once(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    fun once(
        event: Event.READY,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun once(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    override fun prependListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    fun prependListener(
        event: Event.OPEN,
        listener: (fd: Number) -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    fun prependListener(
        event: Event.READY,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun prependListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: Event.OPEN,
        listener: (fd: Number) -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: Event.READY,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */
}
