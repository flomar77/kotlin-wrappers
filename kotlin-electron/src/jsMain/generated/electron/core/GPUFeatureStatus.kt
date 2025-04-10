package electron.core


external interface GPUFeatureStatus {
// Docs: https://electronjs.org/docs/api/structures/gpu-feature-status
    /**
     * Canvas.
     */
    /* '2d_canvas': string; */
    /**
     * Flash.
     */
    var flash_3d: String

    /**
     * Flash Stage3D.
     */
    var flash_stage3d: String

    /**
     * Flash Stage3D Baseline profile.
     */
    var flash_stage3d_baseline: String

    /**
     * Compositing.
     */
    var gpu_compositing: String

    /**
     * Multiple Raster Threads.
     */
    var multiple_raster_threads: String

    /**
     * Native GpuMemoryBuffers.
     */
    var native_gpu_memory_buffers: String

    /**
     * Rasterization.
     */
    var rasterization: String

    /**
     * Video Decode.
     */
    var video_decode: String

    /**
     * Video Encode.
     */
    var video_encode: String

    /**
     * VPx Video Decode.
     */
    var vpx_decode: String

    /**
     * WebGL.
     */
    var webgl: String

    /**
     * WebGL2.
     */
    var webgl2: String
}
