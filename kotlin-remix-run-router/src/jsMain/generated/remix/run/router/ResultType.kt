@file:JsModule("@remix-run/router")

package remix.run.router


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface ResultType {
    companion object {
        val data: ResultType
        val deferred: ResultType
        val redirect: ResultType
        val error: ResultType
    }
}
