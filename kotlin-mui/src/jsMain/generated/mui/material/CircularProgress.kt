// Automatically generated - do not modify!

@file:JsModule("@mui/material/CircularProgress")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface CircularProgressProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    mui.system.PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CircularProgressClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
     * @default 'primary'
     */
    var color: CircularProgressColor?

    /**
     * If `true`, the shrink animation is disabled.
     * This only works if variant is `indeterminate`.
     * @default false
     */
    var disableShrink: Boolean?

    /**
     * The size of the component.
     * If using a number, the pixel unit is assumed.
     * If using a string, you need to provide the CSS unit, e.g '3rem'.
     * @default 40
     */
    var size: dynamic

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The thickness of the circle.
     * @default 3.6
     */
    var thickness: Number?

    /**
     * The value of the progress indicator for the determinate variant.
     * Value between 0 and 100.
     * @default 0
     */
    var value: Number?

    /**
     * The variant to use.
     * Use indeterminate when there is no progress value.
     * @default 'indeterminate'
     */
    var variant: CircularProgressVariant?
}

/**
 * ## ARIA
 *
 * If the progress bar is describing the loading progress of a particular region of a page,
 * you should use `aria-describedby` to point to the progress bar, and set the `aria-busy`
 * attribute to `true` on that region until it has finished loading.
 *
 * Demos:
 *
 * - [Progress](https://mui.com/material-ui/react-progress/)
 *
 * API:
 *
 * - [CircularProgress API](https://mui.com/material-ui/api/circular-progress/)
 */
@JsName("default")
external val CircularProgress: react.FC<CircularProgressProps>
