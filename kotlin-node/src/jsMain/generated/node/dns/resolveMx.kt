@file:JsModule("node:dns")

package node.dns


/**
 * Uses the DNS protocol to resolve mail exchange records (`MX` records) for the`hostname`. The `addresses` argument passed to the `callback` function will
 * contain an array of objects containing both a `priority` and `exchange`property (e.g. `[{priority: 10, exchange: 'mx.example.com'}, ...]`).
 * @since v0.1.27
 */
external fun resolveMx(hostname: String, callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<MxRecord>) -> Unit): Unit
