package electron.core


external interface SegmentedControlSegment {
// Docs: https://electronjs.org/docs/api/structures/segmented-control-segment
    /**
     * Whether this segment is selectable. Default: true.
     */
    var enabled: Boolean?

    /**
     * The image to appear in this segment.
     */
    var icon: NativeImage?

    /**
     * The text to appear in this segment.
     */
    var label: String?
}
