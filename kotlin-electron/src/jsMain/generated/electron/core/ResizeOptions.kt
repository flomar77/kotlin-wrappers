package electron.core


external interface ResizeOptions {
    /**
     * Defaults to the image's width.
     */
    var width: Double?

    /**
     * Defaults to the image's height.
     */
    var height: Double?

    /**
     * The desired quality of the resize image. Possible values are `good`, `better`,
     * or `best`. The default is `best`. These values express a desired quality/speed
     * tradeoff. They are translated into an algorithm-specific method that depends on
     * the capabilities (CPU, GPU) of the underlying platform. It is possible for all
     * three methods to be mapped to the same algorithm on a given platform.
     */
    var quality: String?
}
