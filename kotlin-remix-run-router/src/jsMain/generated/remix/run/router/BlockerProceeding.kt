package remix.run.router


sealed external interface BlockerProceeding {
    var state: String /* "proceeding" */
    var reset: Nothing?
    var proceed: Nothing?
    var location: Location
}
