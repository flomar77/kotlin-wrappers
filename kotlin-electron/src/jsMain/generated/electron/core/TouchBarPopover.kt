@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter


external class TouchBarPopover : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/touch-bar-popover
    /**
     * TouchBarPopover
     */
    constructor (options: TouchBarPopoverConstructorOptions)

    /**
     * A `NativeImage` representing the popover's current button icon. Changing this
     * value immediately updates the popover in the touch bar.
     */
    var icon: NativeImage

    /**
     * A `string` representing the popover's current button text. Changing this value
     * immediately updates the popover in the touch bar.
     */
    var label: String
}
