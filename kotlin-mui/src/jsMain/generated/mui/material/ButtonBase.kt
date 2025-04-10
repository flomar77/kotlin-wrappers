// Automatically generated - do not modify!

@file:JsModule("@mui/material/ButtonBase")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps
import web.cssom.ClassName

external interface ButtonBaseProps :
    react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * A ref for imperative actions.
     * It currently only supports `focusVisible()` action.
     */
    var action: react.Ref<ButtonBaseActions>?

    /**
     * If `true`, the ripples are centered.
     * They won't start at the cursor interaction position.
     * @default false
     */
    var centerRipple: Boolean?

    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ButtonBaseClasses?

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    override var disabled: Boolean?

    /**
     * If `true`, the ripple effect is disabled.
     *
     * ⚠️ Without a ripple there is no styling for :focus-visible by default. Be sure
     * to highlight the element by applying separate styles with the `.Mui-focusVisible` class.
     * @default false
     */
    var disableRipple: Boolean?

    /**
     * If `true`, the touch ripple effect is disabled.
     * @default false
     */
    var disableTouchRipple: Boolean?

    /**
     * If `true`, the base button will have a keyboard focus ripple.
     * @default false
     */
    var focusRipple: Boolean?

    /**
     * This prop can help identify which element has keyboard focus.
     * The class name will be applied when the element gains the focus through keyboard interaction.
     * It's a polyfill for the [CSS :focus-visible selector](https://drafts.csswg.org/selectors-4/#the-focus-visible-pseudo).
     * The rationale for using this feature [is explained here](https://github.com/WICG/focus-visible/blob/HEAD/explainer.md).
     * A [polyfill can be used](https://github.com/WICG/focus-visible) to apply a `focus-visible` class to other components
     * if needed.
     */
    var focusVisibleClassName: ClassName?

    /**
     * The component used to render a link when the `href` prop is provided.
     * @default 'a'
     */
    var LinkComponent: react.ElementType<*>?

    /**
     * Callback fired when the component is focused with a keyboard.
     * We trigger a `onFocus` callback too.
     */
    var onFocusVisible: react.dom.events.FocusEventHandler<*>?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * @default 0
     */
    override var tabIndex: Int?

    /**
     * Props applied to the `TouchRipple` element.
     */
    var TouchRippleProps: dynamic

    /**
     * A ref that points to the `TouchRipple` element.
     */
    var touchRippleRef: react.Ref<TouchRippleActions>?
}

external interface ButtonBaseActions {
    fun focusVisible()
}

/**
 * `ButtonBase` contains as few styles as possible.
 * It aims to be a simple building block for creating a button.
 * It contains a load of style reset and some focus/ripple logic.
 *
 * Demos:
 *
 * - [Button](https://mui.com/material-ui/react-button/)
 *
 * API:
 *
 * - [ButtonBase API](https://mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val ButtonBase: react.FC<ButtonBaseProps>
