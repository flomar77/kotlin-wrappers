package remix.run.router


/**
 * Redirect result from a loader or action
 */

sealed external interface RedirectResult {
    var type: ResultType /* ResultType.redirect */
    var status: Double
    var location: String
    var revalidate: Boolean
    var reloadDocument: Boolean?
}
