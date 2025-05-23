package react.router.dom


/**
 * Submits a fetcher `<form>` to the server without reloading the page.
 */

sealed external interface FetcherSubmitFunction {

    @Suppress("DEPRECATION")
    @nativeInvoke
    operator fun invoke(target: SubmitTarget, options: SubmitOptions = definedExternally): Unit

}
