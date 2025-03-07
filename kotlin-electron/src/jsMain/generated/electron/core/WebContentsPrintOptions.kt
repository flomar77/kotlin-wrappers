package electron.core


external interface WebContentsPrintOptions {
    /**
     * Don't ask user for print settings. Default is `false`.
     */
    var silent: Boolean?

    /**
     * Prints the background color and image of the web page. Default is `false`.
     */
    var printBackground: Boolean?

    /**
     * Set the printer device name to use. Must be the system-defined name and not the
     * 'friendly' name, e.g 'Brother_QL_820NWB' and not 'Brother QL-820NWB'.
     */
    var deviceName: String?

    /**
     * Set whether the printed web page will be in color or grayscale. Default is
     * `true`.
     */
    var color: Boolean?
    var margins: Margins?

    /**
     * Whether the web page should be printed in landscape mode. Default is `false`.
     */
    var landscape: Boolean?

    /**
     * The scale factor of the web page.
     */
    var scaleFactor: Double?

    /**
     * The number of pages to print per page sheet.
     */
    var pagesPerSheet: Double?

    /**
     * Whether the web page should be collated.
     */
    var collate: Boolean?

    /**
     * The number of copies of the web page to print.
     */
    var copies: Double?

    /**
     * The page range to print. On macOS, only one range is honored.
     */
    var pageRanges: js.core.ReadonlyArray<PageRanges>?

    /**
     * Set the duplex mode of the printed web page. Can be `simplex`, `shortEdge`, or
     * `longEdge`.
     */
    var duplexMode: (WebContentsPrintOptionsDuplexMode)?
    var dpi: js.core.ReadonlyRecord<String, Double>?

    /**
     * string to be printed as page header.
     */
    var header: String?

    /**
     * string to be printed as page footer.
     */
    var footer: String?

    /**
     * Specify page size of the printed document. Can be `A0`, `A1`, `A2`, `A3`, `A4`,
     * `A5`, `A6`, `Legal`, `Letter`, `Tabloid` or an Object containing `height` and
     * `width`.
     */
    var pageSize: (Any /* (string) | (Size) */)?
}
