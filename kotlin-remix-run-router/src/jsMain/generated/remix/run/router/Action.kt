@file:JsModule("@remix-run/router")

package remix.run.router


/**
 * Actions represent the type of change to a location value.
 */

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface Action {
    companion object {
        /**
         * A POP indicates a change to an arbitrary index in the history stack, such
         * as a back or forward navigation. It does not describe the direction of the
         * navigation, only that the current index changed.
         *
         * Note: This is the default action for newly created history objects.
         */
        val Pop: Action

        /**
         * A PUSH indicates a new entry being added to the history stack, such as when
         * a link is clicked and a new page loads. When this happens, all subsequent
         * entries in the stack are lost.
         */
        val Push: Action

        /**
         * A REPLACE indicates the entry at the current index in the history stack
         * being replaced by a new one.
         */
        val Replace: Action
    }
}
