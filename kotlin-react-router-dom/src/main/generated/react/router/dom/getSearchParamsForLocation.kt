@file:JsModule("react-router-dom")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router.dom

import web.url.URLSearchParams

external fun getSearchParamsForLocation(locationSearch: String, defaultSearchParams: URLSearchParams?): URLSearchParams
