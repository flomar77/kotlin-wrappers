package react.router.dom

import web.html.HTMLAnchorElement


sealed external interface NavLinkProps : react.Props, react.PropsWithRef<HTMLAnchorElement>, LinkProps {
    @JsName("children")
    var childrenFn: ((props: NavLinkOptions) -> react.ReactNode)?
    var caseSensitive: Boolean?

    @JsName("className")
    var classNameFn: ((props: NavLinkOptions) -> String?)?
    var end: Boolean?

    @JsName("style")
    var styleFn: ((props: NavLinkOptions) -> react.CSSProperties?)?
}
