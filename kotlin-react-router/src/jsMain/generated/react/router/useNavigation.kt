@file:JsModule("react-router")

package react.router

import remix.run.router.Navigation

/**
 * Returns the current navigation, defaulting to an "idle" navigation when
 * no navigation is in progress
 */
external fun useNavigation(): /* import("@remix-run/router") */ Navigation
