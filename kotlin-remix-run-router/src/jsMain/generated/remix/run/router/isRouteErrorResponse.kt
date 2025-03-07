@file:JsModule("@remix-run/router")

package remix.run.router


/**
 * Check if the given error is an ErrorResponse generated from a 4xx/5xx
 * Response thrown from an action/loader
 */
external fun isRouteErrorResponse(error: Any?): Boolean
