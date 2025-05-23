@file:JsModule("react-router")

package react.router

import remix.run.router.Router as RemixRouter

external fun createMemoryRouter(
    routes: js.core.ReadonlyArray<RouteObject>,
    opts: CreateMemoryRouterOpts = definedExternally,
): RemixRouter
