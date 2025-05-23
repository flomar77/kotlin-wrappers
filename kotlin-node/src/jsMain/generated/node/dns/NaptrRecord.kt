package node.dns


sealed external interface NaptrRecord {
    var flags: String
    var service: String
    var regexp: String
    var replacement: String
    var order: Double
    var preference: Double
}
