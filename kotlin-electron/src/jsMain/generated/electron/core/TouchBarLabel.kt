@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter


external class TouchBarLabel : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/touch-bar-label
    /**
     * TouchBarLabel
     */
    constructor (options: TouchBarLabelConstructorOptions)

    /**
     * A `string` representing the description of the label to be read by a screen
     * reader.
     */
    var accessibilityLabel: String

    /**
     * A `string` representing the label's current text. Changing this value
     * immediately updates the label in the touch bar.
     */
    var label: String

    /**
     * A `string` hex code representing the label's current text color. Changing this
     * value immediately updates the label in the touch bar.
     */
    var textColor: String
}
