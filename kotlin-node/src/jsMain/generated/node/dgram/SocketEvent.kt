package node.dgram


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{CLOSE: 'close', CONNECT: 'connect', ERROR: 'error', LISTENING: 'listening', MESSAGE: 'message'}/*union*/)""")
sealed external interface SocketEvent : node.events.EventType {
    object CLOSE : SocketEvent
    object CONNECT : SocketEvent
    object ERROR : SocketEvent
    object LISTENING : SocketEvent
    object MESSAGE : SocketEvent
}
