@file:JsModule("react-router")

package react.router


/**
 * Returns an imperative method for changing the location. Used by <Link>s, but
 * may also be used by other elements to change the location.
 *
 * @see https://reactrouter.com/hooks/use-navigate
 */
external fun useNavigate(): NavigateFunction
