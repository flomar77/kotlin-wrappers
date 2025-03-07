package electron.core

import node.buffer.Buffer


external interface MimeTypedBuffer {
// Docs: https://electronjs.org/docs/api/structures/mime-typed-buffer
    /**
     * Charset of the buffer.
     */
    var charset: String?

    /**
     * The actual Buffer content.
     */
    var data: Buffer

    /**
     * MIME type of the buffer.
     */
    var mimeType: String?
}
