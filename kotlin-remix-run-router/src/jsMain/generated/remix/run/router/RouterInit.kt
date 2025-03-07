package remix.run.router

import web.window.Window

/**
 * Initialization options for createRouter
 */

sealed external interface RouterInit {
    var routes: js.core.ReadonlyArray<AgnosticRouteObject>
    var history: History
    var basename: String?

    /**
     * @deprecated Use `mapRouteProperties` instead
     */
    var detectErrorBoundary: DetectErrorBoundaryFunction?
    var mapRouteProperties: MapRoutePropertiesFunction?
    var future: FutureConfig?
    var hydrationData: HydrationState?
    var window: Window?
}
