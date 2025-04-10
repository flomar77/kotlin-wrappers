// Automatically generated - do not modify!

package web.html

import web.canvas.*
import web.media.streams.MediaStream
import webgl.WebGL2RenderingContext
import webgl.WebGLContextAttributes
import webgl.WebGLRenderingContext

/**
 * Provides properties and methods for manipulating the layout and presentation of <canvas> elements. The HTMLCanvasElement interface also inherits the properties and methods of the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement)
 */
abstract external class HTMLCanvasElement :
    HTMLElement {
    /**
     * Gets or sets the height of a canvas element on a document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/height)
     */
    var height: Int

    /**
     * Gets or sets the width of a canvas element on a document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/width)
     */
    var width: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/captureStream) */
    fun captureStream(frameRequestRate: Number = definedExternally): MediaStream

    /**
     * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
     * @param contextId The identifier (ID) of the type of canvas to create. Internet Explorer 9 and Internet Explorer 10 support only a 2-D context using canvas.getContext("2d"); IE11 Preview also supports 3-D or WebGL context using canvas.getContext("experimental-webgl");
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/getContext)
     */
    fun getContext(
        contextId: RenderingContextId.canvas,
        options: CanvasRenderingContext2DSettings = definedExternally,
    ): CanvasRenderingContext2D?

    fun getContext(
        contextId: RenderingContextId.bitmaprenderer,
        options: ImageBitmapRenderingContextSettings = definedExternally,
    ): ImageBitmapRenderingContext?

    fun getContext(
        contextId: RenderingContextId.webgl,
        options: WebGLContextAttributes = definedExternally,
    ): WebGLRenderingContext?

    fun getContext(
        contextId: RenderingContextId.webgl2,
        options: WebGLContextAttributes = definedExternally,
    ): WebGL2RenderingContext?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toBlob) */
    fun toBlob(
        callback: BlobCallback,
        type: String = definedExternally,
        quality: Number = definedExternally,
    )

    /**
     * Returns the content of the current canvas as an image that you can use as a source for another canvas or an HTML element.
     * @param type The standard MIME type for the image format to return. If you do not specify this parameter, the default value is a PNG format image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toDataURL)
     */
    fun toDataURL(
        type: String = definedExternally,
        quality: Number = definedExternally,
    ): String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/transferControlToOffscreen) */
    fun transferControlToOffscreen(): OffscreenCanvas
}
