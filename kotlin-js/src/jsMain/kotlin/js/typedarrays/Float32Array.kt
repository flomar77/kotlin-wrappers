@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.ReadonlyArray
import js.iterable.JsIterable

open external class Float32Array(
    override val buffer: ArrayBufferLike,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Float32Array, Float> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Float>)
    constructor(elements: ReadonlyArray<Float>)

    companion object : TypedArrayCompanion<Float32Array, Float>
}
