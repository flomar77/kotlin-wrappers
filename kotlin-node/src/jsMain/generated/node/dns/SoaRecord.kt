package node.dns


sealed external interface SoaRecord {
    var nsname: String
    var hostmaster: String
    var serial: Double
    var refresh: Double
    var retry: Double
    var expire: Double
    var minttl: Double
}
