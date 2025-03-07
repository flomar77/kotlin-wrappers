package remix.run.router


/**
 * Potential states for state.navigation
 */

sealed external interface NavigationStates {
    var Idle: NavigationStatesIdle
    var Loading: NavigationStatesLoading
    var Submitting: NavigationStatesSubmitting
}
