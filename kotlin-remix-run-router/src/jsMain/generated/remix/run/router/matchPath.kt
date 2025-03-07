@file:JsModule("@remix-run/router")

package remix.run.router


/**
 * Performs pattern matching on a URL pathname and returns information about
 * the match.
 *
 * @see https://reactrouter.com/utils/match-path
 */
external fun matchPath(pattern: PathPattern, pathname: String): PathMatch?

external fun matchPath(pattern: String, pathname: String): PathMatch?
