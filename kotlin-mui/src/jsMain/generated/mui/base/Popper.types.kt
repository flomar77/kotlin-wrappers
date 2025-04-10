// Automatically generated - do not modify!

package mui.base

import js.core.ReadonlyArray
import popper.core.Modifier
import web.cssom.ClassName
import web.dom.Element

external interface PopperProps :
    PopperOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>

external interface PopperTransitionProps : react.Props {
    var `in`: Boolean

    var onEnter: () -> Unit

    var onExited: () -> Unit
}

external interface PopperChildrenProps : react.Props {
    var placement: popper.core.Placement

    var TransitionProps: PopperTransitionProps?
}

external interface PopperOwnProps : react.Props {
    /**
     * An HTML element, [virtualElement](https://popper.js.org/docs/v2/virtual-elements/),
     * or a function that returns either.
     * It's used to set the position of the popper.
     * The return value will passed as the reference object of the Popper instance.
     */
    var anchorEl: dynamic

    /**
     * Popper render function or node.
     */
    var children: dynamic

    /**
     * An HTML element or function that returns one.
     * The `container` will have the portal children appended to it.
     *
     * By default, it uses the body of the top-level document object,
     * so it's simply `document.body` most of the time.
     */
    var container: Element?

    /**
     * Direction of the text.
     * @default 'ltr'
     */
    var direction: PopperDirection?

    /**
     * The `children` will be under the DOM hierarchy of the parent component.
     * @default false
     */
    var disablePortal: Boolean?

    /**
     * Always keep the children in the DOM.
     * This prop can be useful in SEO situation or
     * when you want to maximize the responsiveness of the Popper.
     * @default false
     */
    var keepMounted: Boolean?

    /**
     * Popper.js is based on a "plugin-like" architecture,
     * most of its features are fully encapsulated "modifiers".
     *
     * A modifier is a function that is called each time Popper.js needs to
     * compute the position of the popper.
     * For this reason, modifiers should be very performant to avoid bottlenecks.
     * To learn how to create a modifier, [read the modifiers documentation](https://popper.js.org/docs/v2/modifiers/).
     */
    var modifiers: ReadonlyArray<Modifier<*>>?

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean

    /**
     * Popper placement.
     * @default 'bottom'
     */
    var placement: popper.core.Placement?

    /**
     * Options provided to the [`Popper.js`](https://popper.js.org/docs/v2/constructors/#options) instance.
     * @default {}
     */
    var popperOptions: popper.core.Options?

    /**
     * A ref that points to the used popper instance.
     */
    var popperRef: react.Ref<popper.core.Instance>?

    /**
     * The props used for each slot inside the Popper.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'div', PopperRootSlotPropsOverrides, PopperOwnerState> */
    }

    /**
     * The components used for each slot inside the Popper.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: PopperSlots?

    /**
     * Help supporting a react-transition-group/Transition component.
     * @default false
     */
    var transition: Boolean?
}

external interface PopperSlots {
    /**
     * The component that renders the root.
     * @default 'div'
     */
    var root: react.ElementType<*>?
}

external interface PopperRootSlotProps : react.PropsWithClassName {
    override var className: ClassName?

    var ownerState: dynamic
}
