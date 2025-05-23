// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package tanstack.query.core

typealias OnlineManagerSetupFn = (setOnline: (online: Boolean?) -> Unit) -> (() -> Unit)?

open external class OnlineManager : Subscribable<Listener> {
    override fun onSubscribe()
    override fun onUnsubscribe()
    open fun setEventListener(setup: OnlineManagerSetupFn)
    open fun setOnline(online: Boolean = definedExternally)
    open fun onOnline()
    open fun isOnline(): Boolean
}

external val onlineManager: OnlineManager
