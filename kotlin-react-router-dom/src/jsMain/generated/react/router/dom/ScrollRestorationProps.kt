package react.router.dom

import remix.run.router.GetScrollRestorationKeyFunction


sealed external interface ScrollRestorationProps : react.Props {
    var getKey: GetScrollRestorationKeyFunction?
    var storageKey: String?
}
