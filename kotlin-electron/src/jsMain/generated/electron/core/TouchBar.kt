@file:JsModule("INTERNAL_ENTITY")

package electron.core


open external class TouchBar {
// Docs: https://electronjs.org/docs/api/touch-bar
    /**
     * TouchBar
     */
    constructor (options: TouchBarConstructorOptions)

    /**
     * A `TouchBarItem` that will replace the "esc" button on the touch bar when set.
     * Setting to `null` restores the default "esc" button. Changing this value
     * immediately updates the escape item in the touch bar.
     */
    var escapeItem: ((Any /* TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer | null */)?)

    companion object {
        /**
         * A `typeof TouchBarButton` reference to the `TouchBarButton` class.
         */
        var TouchBarButton: Any?

        /**
         * A `typeof TouchBarColorPicker` reference to the `TouchBarColorPicker` class.
         */
        var TouchBarColorPicker: Any?

        /**
         * A `typeof TouchBarGroup` reference to the `TouchBarGroup` class.
         */
        var TouchBarGroup: Any?

        /**
         * A `typeof TouchBarLabel` reference to the `TouchBarLabel` class.
         */
        var TouchBarLabel: Any?

        /**
         * A `typeof TouchBarOtherItemsProxy` reference to the `TouchBarOtherItemsProxy`
         * class.
         */
        var TouchBarOtherItemsProxy: Any?

        /**
         * A `typeof TouchBarPopover` reference to the `TouchBarPopover` class.
         */
        var TouchBarPopover: Any?

        /**
         * A `typeof TouchBarScrubber` reference to the `TouchBarScrubber` class.
         */
        var TouchBarScrubber: Any?

        /**
         * A `typeof TouchBarSegmentedControl` reference to the `TouchBarSegmentedControl`
         * class.
         */
        var TouchBarSegmentedControl: Any?

        /**
         * A `typeof TouchBarSlider` reference to the `TouchBarSlider` class.
         */
        var TouchBarSlider: Any?

        /**
         * A `typeof TouchBarSpacer` reference to the `TouchBarSpacer` class.
         */
        var TouchBarSpacer: Any?
    }

}
