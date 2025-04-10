package remix.run.router

import web.http.Headers

/**
 * Unsuccessful result from a loader or action
 */

sealed external interface ErrorResult {
    var type: ResultType /* ResultType.error */
    var error: Any?
    var headers: Headers?
}
