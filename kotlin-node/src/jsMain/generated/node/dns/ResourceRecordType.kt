package node.dns


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{A: 'A', AAAA: 'AAAA', ANY: 'ANY', CNAME: 'CNAME', MX: 'MX', NAPTR: 'NAPTR', NS: 'NS', PTR: 'PTR', SOA: 'SOA', SRV: 'SRV', TXT: 'TXT'}/*union*/)""")
sealed external interface ResourceRecordType {
    object A : ResourceRecordType
    object AAAA : ResourceRecordType
    object ANY : ResourceRecordType
    object CNAME : ResourceRecordType
    object MX : ResourceRecordType
    object NAPTR : ResourceRecordType
    object NS : ResourceRecordType
    object PTR : ResourceRecordType
    object SOA : ResourceRecordType
    object SRV : ResourceRecordType
    object TXT : ResourceRecordType
}
