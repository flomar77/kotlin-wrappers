package remix.run.router


sealed external interface MemoryHistoryOptions {
    var initialEntries: js.core.ReadonlyArray<InitialEntry>?
    var initialIndex: Double?
    var v5Compat: Boolean?
}
