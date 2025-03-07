package remix.run.router


/**
 * Potential states for fetchers
 */

sealed external interface FetcherStates<TData /* default is Any? */> {
    var Idle: FetcherStatesIdle<TData>
    var Loading: FetcherStatesLoading<TData>
    var Submitting: FetcherStatesSubmitting<TData>
}
