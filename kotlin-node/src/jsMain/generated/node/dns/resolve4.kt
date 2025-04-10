@file:JsModule("node:dns")

package node.dns


/**
 * Uses the DNS protocol to resolve a IPv4 addresses (`A` records) for the`hostname`. The `addresses` argument passed to the `callback` function
 * will contain an array of IPv4 addresses (e.g.`['74.125.79.104', '74.125.79.105', '74.125.79.106']`).
 * @since v0.1.16
 * @param hostname Host name to resolve.
 */
external fun resolve4(hostname: String, callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<String>) -> Unit): Unit

external fun resolve4(hostname: String, options: ResolveWithTtlOptions, callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<RecordWithTtl>) -> Unit): Unit

external fun resolve4(hostname: String, options: ResolveOptions, callback: (err: node.ErrnoException?, addresses: Any /* string[] | RecordWithTtl[] */) -> Unit): Unit
