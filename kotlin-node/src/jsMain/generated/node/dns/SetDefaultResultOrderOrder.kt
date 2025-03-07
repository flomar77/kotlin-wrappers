package node.dns


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{ipv4first: 'ipv4first', verbatim: 'verbatim'}/*union*/)""")
sealed external interface SetDefaultResultOrderOrder {
    companion object {
        val ipv4first: SetDefaultResultOrderOrder
        val verbatim: SetDefaultResultOrderOrder
    }
}
