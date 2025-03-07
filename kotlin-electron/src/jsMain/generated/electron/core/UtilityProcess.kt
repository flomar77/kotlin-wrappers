@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter


external class UtilityProcess : NodeEventEmitter {
    /**
     * Emitted after the child process ends.
     */
    fun on(
        event: UtilityProcessEvent.EXIT, listener: (
            /**
             * Contains the exit code for the process obtained from waitpid on posix, or
             * GetExitCodeProcess on windows.
             */
            code: Double
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the child process sends a message using
     * `process.parentPort.postMessage()`.
     */
    fun on(event: UtilityProcessEvent.MESSAGE, listener: (message: Any?) -> Unit): Unit /* this */

    /**
     * Emitted once the child process has spawned successfully.
     */
    fun on(event: UtilityProcessEvent.SPAWN, listener: Function<*>): Unit /* this */
    fun once(
        event: UtilityProcessEvent.EXIT, listener: (
            /**
             * Contains the exit code for the process obtained from waitpid on posix, or
             * GetExitCodeProcess on windows.
             */
            code: Double
        ) -> Unit
    ): Unit /* this */

    fun once(event: UtilityProcessEvent.MESSAGE, listener: (message: Any?) -> Unit): Unit /* this */
    fun once(event: UtilityProcessEvent.SPAWN, listener: Function<*>): Unit /* this */
    fun addListener(
        event: UtilityProcessEvent.EXIT, listener: (
            /**
             * Contains the exit code for the process obtained from waitpid on posix, or
             * GetExitCodeProcess on windows.
             */
            code: Double
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: UtilityProcessEvent.MESSAGE, listener: (message: Any?) -> Unit): Unit /* this */
    fun addListener(event: UtilityProcessEvent.SPAWN, listener: Function<*>): Unit /* this */
    fun removeListener(
        event: UtilityProcessEvent.EXIT, listener: (
            /**
             * Contains the exit code for the process obtained from waitpid on posix, or
             * GetExitCodeProcess on windows.
             */
            code: Double
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: UtilityProcessEvent.MESSAGE, listener: (message: Any?) -> Unit): Unit /* this */
    fun removeListener(event: UtilityProcessEvent.SPAWN, listener: Function<*>): Unit /* this */

    /**
     * Terminates the process gracefully. On POSIX, it uses SIGTERM but will ensure the
     * process is reaped on exit. This function returns true if the kill is successful,
     * and false otherwise.
     */
    fun kill(): Boolean

    /**
     * Send a message to the child process, optionally transferring ownership of zero
     * or more `MessagePortMain` objects.
     *
     * For example:
     */
    fun postMessage(message: Any?, transfer: js.core.ReadonlyArray<MessagePortMain> = definedExternally): Unit

    /**
     * A `Integer | undefined` representing the process identifier (PID) of the child
     * process. If the child process fails to spawn due to errors, then the value is
     * `undefined`. When the child process exits, then the value is `undefined` after
     * the `exit` event is emitted.
     */
    var pid: Double?

    /**
     * A `NodeJS.ReadableStream | null` that represents the child process's stderr. If
     * the child was spawned with options.stdio[2] set to anything other than 'pipe',
     * then this will be `null`. When the child process exits, then the value is `null`
     * after the `exit` event is emitted.
     */
    var stderr: node.ReadableStream?

    /**
     * A `NodeJS.ReadableStream | null` that represents the child process's stdout. If
     * the child was spawned with options.stdio[1] set to anything other than 'pipe',
     * then this will be `null`. When the child process exits, then the value is `null`
     * after the `exit` event is emitted.
     */
    var stdout: node.ReadableStream?

    companion object {
        // Docs: https://electronjs.org/docs/api/utility-process
        fun fork(modulePath: String, args: js.core.ReadonlyArray<String> = definedExternally, options: ForkOptions = definedExternally): UtilityProcess
    }

}
