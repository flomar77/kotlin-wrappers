// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package tanstack.query.core

import js.core.EpochTimeStamp
import js.promise.Promise
import web.abort.AbortSignal

external interface QueryConfig<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    var cache: QueryCache
    var queryKey: TQueryKey
    var queryHash: String
    var logger: Logger
    var options: QueryOptions<TQueryFnData, TError, TData, TQueryKey>
    var defaultOptions: QueryOptions<TQueryFnData, TError, TData, TQueryKey>
    var state: QueryState<TData, TError>
}

external interface QueryState<TData, TError> {
    var data: TData?
    var dataUpdateCount: Int
    var dataUpdatedAt: EpochTimeStamp
    var error: TError?
    var errorUpdateCount: Int
    var errorUpdatedAt: EpochTimeStamp
    var fetchFailureCount: Int
    var fetchFailureReason: TError?
    var fetchMeta: Any
    var isInvalidated: Boolean
    var status: QueryStatus
    var fetchStatus: FetchStatus
}

external interface FetchContext<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    var fetchFn: () -> Promise<*>?
    var fetchOptions: FetchOptions
    var signal: AbortSignal
    var options: QueryOptions<TQueryFnData, TError, TData, *>
    var queryKey: TQueryKey
    var state: QueryState<TData, TError>
}

external interface QueryBehavior<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    var onFetch: (context: FetchContext<TQueryFnData, TError, TData, TQueryKey>) -> Unit
}

external interface FetchOptions {
    var cancelRefetch: Boolean
    var meta: Any
}

external interface FailedAction<TError> {
    var type: Type /* 'failed' */
    var failureCount: Int
    var error: TError
}

external interface FetchAction {
    var type: Type /* 'fetch' */
    var meta: Any
}

external interface SuccessAction<TData> {
    var data: TData?
    var type: Type /* 'success' */
    var dataUpdatedAt: EpochTimeStamp
    var manual: Boolean
}

external interface ErrorAction<TError> {
    var type: Type /* 'error' */
    var error: TError
}

external interface InvalidateAction {
    var type: Type /* 'invalidate' */
}

external interface PauseAction {
    var type: Type /* 'pause' */
}

external interface ContinueAction {
    var type: Type /* 'continue' */
}

external interface SetStateAction<TData, TError> {
    var type: Type /* 'setState' */
    var state: QueryState<TData, TError> /* Partial */
    var setStateOptions: SetStateOptions
}

typealias Action<TData, TError> = Union /* ContinueAction | ErrorAction<TError> | FailedAction<TError> | FetchAction | InvalidateAction | PauseAction | SetStateAction<TData, TError> | SuccessAction<TData> */

external interface SetStateOptions {
    var meta: Any
}

open external class Query<TQueryFnData, TError, TData, TQueryKey : QueryKey>(config: QueryConfig<TQueryFnData, TError, TData, TQueryKey>) : Removable {
    open var queryKey: TQueryKey
    open var queryHash: String
    open var options: QueryOptions<TQueryFnData, TError, TData, TQueryKey>
    open var initialState: QueryState<TData, TError>
    open var revertState: QueryState<TData, TError>
    open var state: QueryState<TData, TError>
    open var isFetchingOptimistic: Boolean
    open var meta: QueryMeta?
    override fun optionalRemove()
    open fun setData(
        newData: TData,
        options: SetDataOptions = definedExternally,
    ): TData

    open fun setState(
        state: QueryState<TData, TError>, /* Partial */
        setStateOptions: SetStateOptions = definedExternally,
    )

    open fun cancel(options: CancelOptions = definedExternally): Promise<Unit>
    override fun destroy()
    open fun reset()
    open fun isActive(): Boolean
    open fun isDisabled(): Boolean
    open fun isStale(): Boolean
    open fun isStaleByTime(staleTime: JsDuration = definedExternally): Boolean
    open fun onFocus()
    open fun onOnline()
    open fun addObserver(observer: QueryObserver<*, *, *, *, *>)
    open fun removeObserver(observer: QueryObserver<*, *, *, *, *>)
    open fun getObserversCount(): Int
    open fun invalidate()
    open fun fetch(
        options: QueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
        fetchOptions: FetchOptions = definedExternally,
    ): Promise<TData>
}
