package electron.core


external interface ProcessMetric {
// Docs: https://electronjs.org/docs/api/structures/process-metric
    /**
     * CPU usage of the process.
     */
    var cpu: CPUUsage

    /**
     * Creation time for this process. The time is represented as number of
     * milliseconds since epoch. Since the `pid` can be reused after a process dies, it
     * is useful to use both the `pid` and the `creationTime` to uniquely identify a
     * process.
     */
    var creationTime: Double

    /**
     * One of the following values:
     *
     * @platform win32
     */
    var integrityLevel: (ProcessMetricIntegrityLevel)?

    /**
     * Memory information for the process.
     */
    var memory: MemoryInfo

    /**
     * The name of the process. Examples for utility: `Audio Service`, `Content
     * Decryption Module Service`, `Network Service`, `Video Capture`, etc.
     */
    var name: String?

    /**
     * Process id of the process.
     */
    var pid: Double

    /**
     * Whether the process is sandboxed on OS level.
     *
     * @platform darwin,win32
     */
    var sandboxed: Boolean?

    /**
     * The non-localized name of the process.
     */
    var serviceName: String?

    /**
     * Process type. One of the following values:
     */
    var type: (ProcessMetricType)
}
