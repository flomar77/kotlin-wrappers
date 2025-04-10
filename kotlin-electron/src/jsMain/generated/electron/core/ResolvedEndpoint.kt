package electron.core


external interface ResolvedEndpoint {
    // Docs: https://electronjs.org/docs/api/structures/resolved-endpoint
    var address: String

    /**
     * One of the following:
     */
    var family: (ResolvedEndpointFamily)
}
