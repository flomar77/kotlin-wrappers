package react.router

import remix.run.router.Action as NavigationType


sealed external interface RouterProps : react.PropsWithChildren {
    var basename: String?
    var location: Any /* Partial<Location> | string */
    var navigationType: NavigationType?
    var navigator: Navigator
    var static: Boolean?
}
