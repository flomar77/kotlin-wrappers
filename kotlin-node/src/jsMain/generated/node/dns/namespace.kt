@file:JsModule("node:dns")

package node.dns


/* import * as dnsPromises from 'node:dns/promises'; */

// Supported getaddrinfo flags.
external val ADDRCONFIG: Double

external val V4MAPPED: Double

/**
 * If `dns.V4MAPPED` is specified, return resolved IPv6 addresses as
 * well as IPv4 mapped IPv6 addresses.
 */
external val ALL: Double

// Error codes
external val NODATA: String

external val FORMERR: String

external val SERVFAIL: String

external val NOTFOUND: String

external val NOTIMP: String

external val REFUSED: String

external val BADQUERY: String

external val BADNAME: String

external val BADFAMILY: String

external val BADRESP: String

external val CONNREFUSED: String

external val TIMEOUT: String

external val EOF: String

external val FILE: String

external val NOMEM: String

external val DESTRUCTION: String

external val BADSTR: String

external val BADFLAGS: String

external val NONAME: String

external val BADHINTS: String

external val NOTINITIALIZED: String

external val LOADIPHLPAPI: String

external val ADDRGETNETWORKPARAMS: String

external val CANCELLED: String

/* export { dnsPromises as promises }; */
