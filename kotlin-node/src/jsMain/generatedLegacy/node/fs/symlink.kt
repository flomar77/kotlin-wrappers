// Automatically generated - do not modify!

package node.fs

import js.promise.await

suspend fun symlink(
    target: PathLike,
    path: PathLike,
) {
    symlinkAsync(
        target = target,
        path = path,
    ).await()
}

suspend fun symlink(
    target: PathLike,
    path: PathLike,
    type: String?,
) {
    symlinkAsync(
        target = target,
        path = path,
        type = type,
    ).await()
}
