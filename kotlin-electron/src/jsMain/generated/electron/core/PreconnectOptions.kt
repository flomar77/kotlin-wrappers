package electron.core


external interface PreconnectOptions {
    /**
     * URL for preconnect. Only the origin is relevant for opening the socket.
     */
    var url: String

    /**
     * number of sockets to preconnect. Must be between 1 and 6. Defaults to 1.
     */
    var numSockets: Double?
}
