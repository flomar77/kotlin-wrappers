// Automatically generated - do not modify!

package node.fs

import js.promise.await

suspend fun rm(
    path: PathLike,
) {
    rmAsync(
        path = path,
    ).await()
}

suspend fun rm(
    path: PathLike,
    options: RmOptions,
) {
    rmAsync(
        path = path,
        options = options,
    ).await()
}
