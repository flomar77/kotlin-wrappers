// Automatically generated - do not modify!

package node.childProcess

import js.core.ReadonlyArray
import node.events.Abortable

sealed external interface ForkOptions : ProcessEnvOptions, MessagingOptions, Abortable {
    var execPath: String?
    var execArgv: ReadonlyArray<String>?
    var silent: Boolean?

    /**
     * Can be set to 'pipe', 'inherit', 'overlapped', or 'ignore', or an array of these strings.
     * If passed as an array, the first element is used for `stdin`, the second for
     * `stdout`, and the third for `stderr`. A fourth element can be used to
     * specify the `stdio` behavior beyond the standard streams. See
     * {@link ChildProcess.stdio} for more information.
     *
     * @default 'pipe'
     */
    var stdio: StdioOptions?
    var detached: Boolean?
    var windowsVerbatimArguments: Boolean?
}
