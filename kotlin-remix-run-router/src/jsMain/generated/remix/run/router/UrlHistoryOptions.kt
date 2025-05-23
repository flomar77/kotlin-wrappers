package remix.run.router

import web.window.Window


sealed external interface UrlHistoryOptions {
    var window: Window?
    var v5Compat: Boolean?
}
