package electron.core


external interface IOCounters {
// Docs: https://electronjs.org/docs/api/structures/io-counters
    /**
     * Then number of I/O other operations.
     */
    var otherOperationCount: Double

    /**
     * Then number of I/O other transfers.
     */
    var otherTransferCount: Double

    /**
     * The number of I/O read operations.
     */
    var readOperationCount: Double

    /**
     * The number of I/O read transfers.
     */
    var readTransferCount: Double

    /**
     * The number of I/O write operations.
     */
    var writeOperationCount: Double

    /**
     * The number of I/O write transfers.
     */
    var writeTransferCount: Double
}
