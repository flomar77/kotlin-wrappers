@file:JsModule("react-router")

package react.router


/**
 * Returns the context (if provided) for the child route at this level of the route
 * hierarchy.
 * @see https://reactrouter.com/hooks/use-outlet-context
 */
external fun <Context /* default is Any? */> useOutletContext(): Context
