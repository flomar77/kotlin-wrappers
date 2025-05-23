package remix.run.router

import js.promise.Promise

/**
 * lazy() function to load a route definition, which can add non-matching
 * related properties to a route
 */
typealias LazyRouteFunction<R /* : AgnosticRouteObject */> = () -> Promise<R>
