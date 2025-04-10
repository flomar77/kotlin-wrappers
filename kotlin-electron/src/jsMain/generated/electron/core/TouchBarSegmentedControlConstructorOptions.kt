package electron.core


external interface TouchBarSegmentedControlConstructorOptions {
    /**
     * Style of the segments:
     */
    var segmentStyle: (TouchBarSegmentedControlConstructorOptionsSegmentStyle)?

    /**
     * The selection mode of the control:
     */
    var mode: (TouchBarSegmentedControlConstructorOptionsMode)?

    /**
     * An array of segments to place in this control.
     */
    var segments: js.core.ReadonlyArray<SegmentedControlSegment>

    /**
     * The index of the currently selected segment, will update automatically with user
     * interaction. When the mode is `multiple` it will be the last selected item.
     */
    var selectedIndex: Double?

    /**
     * Called when the user selects a new segment.
     */
    var change: ((selectedIndex: Double, isSelected: Boolean) -> Unit)?
}
