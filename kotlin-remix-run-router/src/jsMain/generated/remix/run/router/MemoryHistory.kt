package remix.run.router

/**
 * A memory history stores locations in memory. This is useful in stateful
 * environments where there is no web browser, such as node tests or React
 * Native.
 */

sealed external interface MemoryHistory : History {
    /**
     * The current index in the history stack.
     */
    val index: Double
}
