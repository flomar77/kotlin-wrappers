// Automatically generated - do not modify!

package node.fs

import js.promise.await
import node.buffer.Buffer

suspend fun realpath(
    path: PathLike,
): String =
    realpathAsync(
        path = path,
    ).await()

suspend fun realpath(
    path: PathLike,
    options: node.buffer.BufferEncoding?, /* ObjectEncodingOptions | BufferEncoding */
): String =
    realpathAsync(
        path = path,
        options = options,
    ).await()


suspend fun realpath(
    path: PathLike,
    options: BufferEncodingOption,
): Buffer =
    realpathAsync(
        path = path,
        options = options,
    ).await()
