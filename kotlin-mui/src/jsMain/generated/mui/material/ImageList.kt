// Automatically generated - do not modify!

@file:JsModule("@mui/material/ImageList")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface ImageListProps :
    react.dom.html.HTMLAttributes<web.html.HTMLUListElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * The content of the component, normally `ImageListItem`s.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ImageListClasses?

    /**
     * Number of columns.
     * @default 2
     */
    var cols: Number?

    /**
     * The gap between items in px.
     * @default 4
     */
    var gap: Number?

    /**
     * The height of one row in px.
     * @default 'auto'
     */
    var rowHeight: dynamic

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The variant to use.
     * @default 'standard'
     */
    var variant: ImageListVariant?
}

/**
 *
 * Demos:
 *
 * - [Image List](https://mui.com/material-ui/react-image-list/)
 *
 * API:
 *
 * - [ImageList API](https://mui.com/material-ui/api/image-list/)
 */
@JsName("default")
external val ImageList: react.FC<ImageListProps>
