package js.core

external interface ArrayLike<out T> {
    val length: Int

    @nativeGetter
    @Suppress(
        "DEPRECATION",
        "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    )
    operator fun get(
        index: Int,
    ): T = definedExternally
}

fun <T> ArrayLike<T>.asList(): List<T> =
    object : AbstractList<T>() {
        override val size: Int
            get() = this@asList.length

        override fun get(index: Int): T =
            when (index) {
                in 0..lastIndex -> this@asList[index]
                else -> throw IndexOutOfBoundsException("index $index is not in range [0..$lastIndex]")
            }
    }
