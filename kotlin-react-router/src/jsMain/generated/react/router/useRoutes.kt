@file:JsModule("react-router")

package react.router

import remix.run.router.Location

/**
 * Returns the element of the route that matched the current location, prepared
 * with the correct context to render the remainder of the route tree. Route
 * elements in the tree must render an <Outlet> to render their child route's
 * element.
 *
 * @see https://reactrouter.com/hooks/use-routes
 */
external fun useRoutes(
    routes: js.core.ReadonlyArray<RouteObject>,
    locationArg: Location = definedExternally,
): react.ReactElement<*>?

external fun useRoutes(
    routes: js.core.ReadonlyArray<RouteObject>,
    locationArg: String = definedExternally,
): react.ReactElement<*>?
