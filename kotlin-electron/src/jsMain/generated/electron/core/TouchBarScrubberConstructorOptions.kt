package electron.core


external interface TouchBarScrubberConstructorOptions {
    /**
     * An array of items to place in this scrubber.
     */
    var items: js.core.ReadonlyArray<ScrubberItem>

    /**
     * Called when the user taps an item that was not the last tapped item.
     */
    var select: ((selectedIndex: Double) -> Unit)?

    /**
     * Called when the user taps any item.
     */
    var highlight: ((highlightedIndex: Double) -> Unit)?

    /**
     * Selected item style. Can be `background`, `outline` or `none`. Defaults to
     * `none`.
     */
    var selectedStyle: (TouchBarScrubberConstructorOptionsSelectedStyle)?

    /**
     * Selected overlay item style. Can be `background`, `outline` or `none`. Defaults
     * to `none`.
     */
    var overlayStyle: (TouchBarScrubberConstructorOptionsOverlayStyle)?

    /**
     * Whether to show arrow buttons. Defaults to `false` and is only shown if `items`
     * is non-empty.
     */
    var showArrowButtons: Boolean?

    /**
     * Can be `fixed` or `free`. The default is `free`.
     */
    var mode: (TouchBarScrubberConstructorOptionsMode)?

    /**
     * Defaults to `true`.
     */
    var continuous: Boolean?
}
