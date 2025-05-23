package electron.core


external interface InputEvent {
// Docs: https://electronjs.org/docs/api/structures/input-event
    /**
     * An array of modifiers of the event, can be `shift`, `control`, `ctrl`, `alt`,
     * `meta`, `command`, `cmd`, `isKeypad`, `isAutoRepeat`, `leftButtonDown`,
     * `middleButtonDown`, `rightButtonDown`, `capsLock`, `numLock`, `left`, `right`.
     */
    var modifiers: Array<InputEventModifier>?

    /**
     * Can be `undefined`, `mouseDown`, `mouseUp`, `mouseMove`, `mouseEnter`,
     * `mouseLeave`, `contextMenu`, `mouseWheel`, `rawKeyDown`, `keyDown`, `keyUp`,
     * `char`, `gestureScrollBegin`, `gestureScrollEnd`, `gestureScrollUpdate`,
     * `gestureFlingStart`, `gestureFlingCancel`, `gesturePinchBegin`,
     * `gesturePinchEnd`, `gesturePinchUpdate`, `gestureTapDown`, `gestureShowPress`,
     * `gestureTap`, `gestureTapCancel`, `gestureShortPress`, `gestureLongPress`,
     * `gestureLongTap`, `gestureTwoFingerTap`, `gestureTapUnconfirmed`,
     * `gestureDoubleTap`, `touchStart`, `touchMove`, `touchEnd`, `touchCancel`,
     * `touchScrollStarted`, `pointerDown`, `pointerUp`, `pointerMove`,
     * `pointerRawUpdate`, `pointerCancel` or `pointerCausedUaAction`.
     */
    var type: (InputEventType)
}
