package remix.run.router

import web.http.Headers

/**
 * Successful defer() result from a loader or action
 */

sealed external interface DeferredResult {
    var type: ResultType /* ResultType.deferred */
    var deferredData: DeferredData
    var statusCode: Double?
    var headers: Headers?
}
