// Automatically generated - do not modify!

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
)

package tanstack.query.core

import js.core.EpochTimeStamp
import js.core.ReadonlyArray
import js.core.Record
import js.core.Void
import js.promise.Promise
import web.abort.AbortSignal

// readonly unknown[]
external interface QueryKey

typealias QueryFunction<T, TQueryKey, TPageParam> = (context: QueryFunctionContext<TQueryKey, TPageParam>) -> Promise<T>

external interface QueryFunctionContext<TQueryKey : QueryKey, TPageParam> {
    var queryKey: TQueryKey
    var signal: AbortSignal
    var pageParam: TPageParam
    var meta: QueryMeta?
}

typealias InitialDataFunction<T> = () -> T?

typealias PlaceholderDataFunction<TResult> = () -> TResult?

typealias QueryKeyHashFunction<TQueryKey> = (queryKey: TQueryKey) -> String

typealias GetPreviousPageParamFunction<TQueryFnData> = (firstPage: TQueryFnData, allPages: ReadonlyArray<TQueryFnData>) -> Any

typealias GetNextPageParamFunction<TQueryFnData> = (lastPage: TQueryFnData, allPages: ReadonlyArray<TQueryFnData>) -> Any

external interface InfiniteData<TData> {
    var pages: ReadonlyArray<TData>
    var pageParams: ReadonlyArray<PageParam>
}

external interface QueryMeta : Record<String, Any>

typealias NotifyOnChangeProps = Union /* Array<keyof InfiniteQueryObserverResult> | 'all' | (() => Array<keyof InfiniteQueryObserverResult> | 'all') */

external interface QueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    var retry: RetryValue<TError>
    var retryDelay: RetryDelayValue<TError>
    var networkMode: NetworkMode
    var cacheTime: JsDuration
    var queryFn: QueryFunction<TQueryFnData, TQueryKey, *>
    var queryHash: String
    var queryKey: TQueryKey
    var queryKeyHashFn: QueryKeyHashFunction<TQueryKey>
    var initialData: InitialDataFunction<TData> /* | TData */
    var initialDataUpdatedAt: Any /* number | (() => number | undefined) */
    var behavior: QueryBehavior<TQueryFnData, TError, TData, *>
    var structuralSharing: (oldData: TData?, newData: TData) -> TData /* | boolean */
    var getPreviousPageParam: GetPreviousPageParamFunction<TQueryFnData>
    var getNextPageParam: GetNextPageParamFunction<TQueryFnData>
    var _defaulted: Boolean
    var meta: QueryMeta
}

typealias UseErrorBoundary<TQueryFnData, TError, TQueryData, TQueryKey> = (error: TError, query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> Boolean

external interface QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey>
    : QueryOptions<TQueryFnData, TError, TQueryData, TQueryKey> {
    var enabled: Boolean
    var staleTime: JsDuration
    var refetchInterval: (data: TData?, query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> JsDuration /* | number | false */
    var refetchIntervalInBackground: Boolean
    var refetchOnWindowFocus: (query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> Boolean /* | boolean | 'always' */
    var refetchOnReconnect: (query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> Boolean /* | boolean | 'always' */
    var refetchOnMount: (query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> Boolean /* | boolean | 'always' */
    var retryOnMount: Boolean
    var notifyOnChangeProps: NotifyOnChangeProps
    var onSuccess: (data: TData) -> Unit
    var onError: (err: TError) -> Unit
    var onSettled: (data: TData?, error: TError?) -> Unit
    var useErrorBoundary: UseErrorBoundary<TQueryFnData, TError, TQueryData, TQueryKey>
    var select: (data: TQueryData) -> TData
    var suspense: Boolean
    var keepPreviousData: Boolean
    var placeholderData: PlaceholderDataFunction<TQueryData> /* | TQueryData */
    var _optimisticResults: String /* 'optimistic' | 'isRestoring' */
}

typealias WithRequired<T, K> = Any

typealias DefaultedQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey> = Union /* WithRequired<QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>, 'useErrorBoundary' | 'refetchOnReconnect'> */

external interface InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey>
    : QueryObserverOptions<TQueryFnData, TError, InfiniteData<TData>, InfiniteData<TQueryData>, TQueryKey>

typealias DefaultedInfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey> = Union /* WithRequired<InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>, 'useErrorBoundary' | 'refetchOnReconnect'> */

external interface FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey>
    : QueryOptions<TQueryFnData, TError, TData, TQueryKey> {
    var staleTime: JsDuration
}

external interface FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey>
    : FetchQueryOptions<TQueryFnData, TError, InfiniteData<TData>, TQueryKey>

external interface ResultOptions {
    var throwOnError: Boolean
}

external interface RefetchPageFilters<TPageData> {
    var refetchPage: (lastPage: TPageData, index: Int, allPages: ReadonlyArray<TPageData>) -> Boolean
}

external interface RefetchOptions : ResultOptions {
    var cancelRefetch: Boolean
}

external interface InvalidateQueryFilters<TPageData>
    : QueryFilters, RefetchPageFilters<TPageData> {
    var refetchType: QueryTypeFilter /* | 'none' */
}

external interface RefetchQueryFilters<TPageData>
    : QueryFilters, RefetchPageFilters<TPageData>

external interface ResetQueryFilters<TPageData>
    : QueryFilters, RefetchPageFilters<TPageData>

external interface InvalidateOptions : RefetchOptions

external interface ResetOptions : RefetchOptions

external interface FetchNextPageOptions : ResultOptions {
    var cancelRefetch: Boolean
    var pageParam: PageParam
}

external interface FetchPreviousPageOptions : ResultOptions {
    var cancelRefetch: Boolean
    var pageParam: PageParam
}

external interface QueryObserverBaseResult<TData, TError> {
    val data: TData?
    val dataUpdatedAt: EpochTimeStamp
    val error: TError?
    val errorUpdatedAt: EpochTimeStamp
    val failureCount: Int
    val failureReason: TError?
    val errorUpdateCount: Int
    val isError: Boolean
    val isFetched: Boolean
    val isFetchedAfterMount: Boolean
    val isFetching: Boolean
    val isLoading: Boolean
    val isLoadingError: Boolean
    val isInitialLoading: Boolean
    val isPaused: Boolean
    val isPlaceholderData: Boolean
    val isPreviousData: Boolean
    val isRefetchError: Boolean
    val isRefetching: Boolean
    val isStale: Boolean
    val isSuccess: Boolean
    val refetch: (options: RefetchOptions? /* & RefetchQueryFilters<TPageData> */) -> Promise<QueryObserverResult<TData, TError>>
    val remove: () -> Unit
    val status: QueryStatus
    val fetchStatus: FetchStatus
}

external interface QueryObserverLoadingResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    override val data: Void
    override val error: Void
    override val isError: False
    override val isLoading: True
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: False
    override val status: QueryStatus /* 'loading' */
}

external interface QueryObserverLoadingErrorResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    override val data: Void
    override val error: TError
    override val isError: True
    override val isLoading: False
    override val isLoadingError: True
    override val isRefetchError: False
    override val isSuccess: False
    override val status: QueryStatus /* 'error' */
}

external interface QueryObserverRefetchErrorResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    override val data: TData
    override val error: TError
    override val isError: True
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: True
    override val isSuccess: False
    override val status: QueryStatus /* 'error' */
}

external interface QueryObserverSuccessResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    override val data: TData
    override val error: Void
    override val isError: False
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: True
    override val status: QueryStatus /* 'success' */
}

sealed external interface DefinedQueryObserverResult<TData, TError>
    : QueryObserverBaseResult<TData, TError>

sealed external interface QueryObserverResult<TData, TError>
    : QueryObserverBaseResult<TData, TError>

external interface InfiniteQueryObserverBaseResult<TData, TError>
    : QueryObserverResult<InfiniteData<TData>, TError> {
    val fetchNextPage: (options: FetchNextPageOptions?) -> Promise<InfiniteQueryObserverResult<TData, TError>>
    val fetchPreviousPage: (options: FetchPreviousPageOptions?) -> Promise<InfiniteQueryObserverResult<TData, TError>>
    val hasNextPage: Boolean
    val hasPreviousPage: Boolean
    val isFetchingNextPage: Boolean
    val isFetchingPreviousPage: Boolean
}

external interface InfiniteQueryObserverLoadingResult<TData, TError>
    : InfiniteQueryObserverResult<TData, TError> {
    override val data: Void
    override val error: Void
    override val isError: False
    override val isLoading: True
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: False
    override val status: QueryStatus /* 'loading' */
}

external interface InfiniteQueryObserverLoadingErrorResult<TData, TError>
    : InfiniteQueryObserverResult<TData, TError> {
    override val data: Void
    override val error: TError
    override val isError: True
    override val isLoading: False
    override val isLoadingError: True
    override val isRefetchError: False
    override val isSuccess: False
    override val status: QueryStatus /* 'error' */
}

external interface InfiniteQueryObserverRefetchErrorResult<TData, TError>
    : InfiniteQueryObserverResult<TData, TError> {
    override val data: InfiniteData<TData>
    override val error: TError
    override val isError: True
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: True
    override val isSuccess: False
    override val status: QueryStatus /* 'error' */
}

external interface InfiniteQueryObserverSuccessResult<TData, TError>
    : InfiniteQueryObserverResult<TData, TError> {
    override val data: InfiniteData<TData>
    override val error: Void
    override val isError: False
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: True
    override val status: QueryStatus /* 'success' */
}

sealed external interface InfiniteQueryObserverResult<TData, TError>
    : InfiniteQueryObserverBaseResult<TData, TError>

typealias MutationKey = Any

external interface MutationMeta : Record<String, Any>

typealias MutationFunction<TData, TVariables> = (variables: TVariables) -> Promise<TData>

external interface MutationOptions<TData, TError, TVariables, TContext> {
    var mutationFn: MutationFunction<TData, TVariables>
    var mutationKey: MutationKey
    var variables: TVariables
    var onMutate: (variables: TVariables) -> Promise<TContext?>?
    var onSuccess: (data: TData, variables: TVariables, context: TContext?) -> Promise<*>?
    var onError: (error: TError, variables: TVariables, context: TContext?) -> Promise<*>?
    var onSettled: (data: TData?, error: TError?, variables: TVariables, context: TContext?) -> Promise<*>?
    var retry: RetryValue<TError>
    var retryDelay: RetryDelayValue<TError>
    var networkMode: NetworkMode
    var cacheTime: JsDuration
    var _defaulted: Boolean
    var meta: MutationMeta
}

external interface MutationObserverOptions<TData, TError, TVariables, TContext>
    : MutationOptions<TData, TError, TVariables, TContext> {
    var useErrorBoundary: (error: TError) -> Boolean
}

external interface MutateOptions<TData, TError, TVariables, TContext> {
    var onSuccess: (data: TData, variables: TVariables, context: TContext) -> Unit
    var onError: (error: TError, variables: TVariables, context: TContext?) -> Unit
    var onSettled: (data: TData?, error: TError?, variables: TVariables, context: TContext?) -> Unit
}

typealias MutateFunction<TData, TError, TVariables, TContext> = (variables: TVariables, options: MutateOptions<TData, TError, TVariables, TContext>?) -> Promise<TData>

external interface MutationObserverBaseResult<TData, TError, TVariables, TContext>
    : MutationState<TData, TError, TVariables, TContext> {
    val isError: Boolean
    val isIdle: Boolean
    val isLoading: Boolean
    val isSuccess: Boolean
    val mutate: MutateFunction<TData, TError, TVariables, TContext>
    val reset: () -> Unit
}

external interface MutationObserverIdleResult<TData, TError, TVariables, TContext>
    : MutationObserverResult<TData, TError, TVariables, TContext> {
    override val data: Void
    override val error: Void
    override val isError: False
    override val isIdle: True
    override val isLoading: False
    override val isSuccess: False
    override val status: MutationStatus /* 'idle' */
}

external interface MutationObserverLoadingResult<TData, TError, TVariables, TContext>
    : MutationObserverResult<TData, TError, TVariables, TContext> {
    override val data: Void
    override val error: Void
    override val isError: False
    override val isIdle: False
    override val isLoading: True
    override val isSuccess: False
    override val status: MutationStatus /* 'loading' */
}

external interface MutationObserverErrorResult<TData, TError, TVariables, TContext>
    : MutationObserverResult<TData, TError, TVariables, TContext> {
    override val data: Void
    override val error: TError
    override val isError: True
    override val isIdle: False
    override val isLoading: False
    override val isSuccess: False
    override val status: MutationStatus /* 'error' */
}

external interface MutationObserverSuccessResult<TData, TError, TVariables, TContext>
    : MutationObserverResult<TData, TError, TVariables, TContext> {
    override val data: TData
    override val error: Void
    override val isError: False
    override val isIdle: False
    override val isLoading: False
    override val isSuccess: True
    override val status: MutationStatus /* 'success' */
}

external interface MutationObserverResult<TData, TError, TVariables, TContext>
    : MutationObserverBaseResult<TData, TError, TVariables, TContext>

external interface QueryClientConfig {
    var queryCache: QueryCache
    var mutationCache: MutationCache
    var logger: Logger
    var defaultOptions: DefaultOptions<*>
}

external interface DefaultOptions<TError> {
    var queries: QueryObserverOptions<*, TError, *, *, *>
    var mutations: MutationObserverOptions<*, TError, *, *>
}

external interface CancelOptions {
    var revert: Boolean
    var silent: Boolean
}

external interface SetDataOptions {
    var updatedAt: EpochTimeStamp
}

external interface NotifyEvent {
    var type: NotifyEventType
}
