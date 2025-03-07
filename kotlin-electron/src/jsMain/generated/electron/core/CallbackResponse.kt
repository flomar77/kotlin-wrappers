package electron.core


external interface CallbackResponse {
    var cancel: Boolean?

    /**
     * The original request is prevented from being sent or completed and is instead
     * redirected to the given URL.
     */
    var redirectURL: String?
}
