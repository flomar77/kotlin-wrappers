@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package js.iterable

import js.promise.Promise

sealed external interface AsyncIterator<out T> {
    fun next(): Promise<IteratorResult<T, *>>

    inline operator fun iterator(): SuspendableIterator<T> =
        iteratorFor(this)
}
