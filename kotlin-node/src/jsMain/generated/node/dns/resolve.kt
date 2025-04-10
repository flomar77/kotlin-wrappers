@file:JsModule("node:dns")

package node.dns


/**
 * Uses the DNS protocol to resolve a host name (e.g. `'nodejs.org'`) into an array
 * of the resource records. The `callback` function has arguments`(err, records)`. When successful, `records` will be an array of resource
 * records. The type and structure of individual results varies based on `rrtype`:
 *
 * <omitted>
 *
 * On error, `err` is an `Error` object, where `err.code` is one of the `DNS error codes`.
 * @since v0.1.27
 * @param hostname Host name to resolve.
 * @param [rrtype='A'] Resource record type.
 */
external fun resolve(hostname: String, callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<String>) -> Unit): Unit

external fun resolve(hostname: String, rrtype: ResourceRecordType.A, callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<String>) -> Unit): Unit

external fun resolve(hostname: String, rrtype: ResourceRecordType.AAAA, callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<String>) -> Unit): Unit

external fun resolve(hostname: String, rrtype: ResourceRecordType.ANY, callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<AnyRecord>) -> Unit): Unit

external fun resolve(hostname: String, rrtype: ResourceRecordType.CNAME, callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<String>) -> Unit): Unit

external fun resolve(hostname: String, rrtype: ResourceRecordType.MX, callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<MxRecord>) -> Unit): Unit

external fun resolve(hostname: String, rrtype: ResourceRecordType.NAPTR, callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<NaptrRecord>) -> Unit): Unit

external fun resolve(hostname: String, rrtype: ResourceRecordType.NS, callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<String>) -> Unit): Unit

external fun resolve(hostname: String, rrtype: ResourceRecordType.PTR, callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<String>) -> Unit): Unit

external fun resolve(hostname: String, rrtype: ResourceRecordType.SOA, callback: (err: node.ErrnoException?, addresses: SoaRecord) -> Unit): Unit

external fun resolve(hostname: String, rrtype: ResourceRecordType.SRV, callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<SrvRecord>) -> Unit): Unit

external fun resolve(hostname: String, rrtype: ResourceRecordType.TXT, callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<js.core.ReadonlyArray<String>>) -> Unit): Unit

external fun resolve(
    hostname: String,
    rrtype: String,
    callback: (err: node.ErrnoException?, addresses: Any /* string[] | MxRecord[] | NaptrRecord[] | SoaRecord | SrvRecord[] | string[][] | AnyRecord[] */) -> Unit
): Unit
