package electron.core


external interface ContinueActivityDetails {
    /**
     * A string identifying the URL of the webpage accessed by the activity on another
     * device, if available.
     */
    var webpageURL: String?
}
