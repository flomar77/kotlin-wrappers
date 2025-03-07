// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package tanstack.query.core

typealias FocusManagerSetupFn = (setFocused: (focused: Boolean?) -> Unit) -> (() -> Unit)?

open external class FocusManager : Subscribable<Listener> {
    override fun onSubscribe()
    override fun onUnsubscribe()
    open fun setEventListener(setup: FocusManagerSetupFn)
    open fun setFocused(focused: Boolean = definedExternally)
    open fun onFocus()
    open fun isFocused(): Boolean
}

external val focusManager: FocusManager
