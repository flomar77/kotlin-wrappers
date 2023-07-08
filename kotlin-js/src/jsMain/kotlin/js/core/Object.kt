package js.core

external class Object internal constructor() {
    fun hasOwnProperty(v: String): Boolean
    fun isPrototypeOf(v: Any): Boolean
    fun propertyIsEnumerable(v: String): Boolean
    fun toLocaleString(): String
    fun valueOf(): Any

    companion object {
        fun <T : Any, R : T> assign(dest: R, vararg src: T?): R
        fun <T : Any> create(o: T?, properties: dynamic = definedExternally): T
        fun <T : Any> defineProperties(o: T, properties: dynamic): T
        fun <T : Any, P> defineProperty(o: T, p: String, attributes: PropertyDescriptor<P>): T
        fun <T : Any, P> defineProperty(o: T, p: Symbol, attributes: PropertyDescriptor<P>): T
        fun <T : Any> entries(o: ReadonlyRecord<String, T>): ReadonlyArray<JsTuple2<String, T>>
        fun entries(o: Any): ReadonlyArray<JsTuple2<String, Any?>>
        fun <R, T : R> freeze(o: T): R
        fun <T> getOwnPropertyDescriptor(o: Any, p: String): PropertyDescriptor<T>?
        fun <T> getOwnPropertyDescriptor(o: Any, p: Symbol): PropertyDescriptor<T>?
        fun getOwnPropertyNames(o: Any): ReadonlyArray<String>
        fun getOwnPropertySymbols(o: Any): ReadonlyArray<Symbol>
        fun <P : Any, T : P> getPrototypeOf(o: T): P
        fun hasOwn(o: Any, v: String /* PropertyKey */): Boolean
        fun hasOwn(o: Any, v: Number /* PropertyKey */): Boolean
        fun hasOwn(o: Any, v: Symbol /* PropertyKey */): Boolean
        fun `is`(value1: Any?, value2: Any?): Boolean
        fun isExtensible(o: Any): Boolean
        fun isFrozen(o: Any): Boolean
        fun isSealed(o: Any): Boolean
        fun keys(o: Any): ReadonlyArray<String>
        fun <T> preventExtensions(o: T): T
        fun <T> seal(o: T): T
        fun <T : Any> values(o: ReadonlyRecord<*, T>): ReadonlyArray<T>
        fun values(o: Any): ReadonlyArray<Any?>
    }
}
