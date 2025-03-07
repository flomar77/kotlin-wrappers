package js.core

fun <T> Sequence<T>.toTypedArray(): Array<T> {
    val array = emptyArray<T>()
    val iterator = iterator()

    while (iterator.hasNext()) {
        array.push(iterator.next())
    }

    return array
}
