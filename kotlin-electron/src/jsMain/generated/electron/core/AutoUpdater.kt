package electron.core

import kotlin.js.Date


external interface AutoUpdater : node.events.IEventEmitter {
// Docs: https://electronjs.org/docs/api/auto-updater
    /**
     * This event is emitted after a user calls `quitAndInstall()`.
     *
     * When this API is called, the `before-quit` event is not emitted before all
     * windows are closed. As a result you should listen to this event if you wish to
     * perform actions before the windows are closed while a process is quitting, as
     * well as listening to `before-quit`.
     */
    fun on(event: AutoUpdaterEvent.BEFORE_QUIT_FOR_UPDATE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when checking if an update has started.
     */
    fun on(event: AutoUpdaterEvent.CHECKING_FOR_UPDATE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when there is an error while updating.
     */
    fun on(event: AutoUpdaterEvent.ERROR, listener: (error: Throwable /* JsError */) -> Unit): Unit /* this */

    /**
     * Emitted when there is an available update. The update is downloaded
     * automatically.
     */
    fun on(event: AutoUpdaterEvent.UPDATE_AVAILABLE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when an update has been downloaded.
     *
     * On Windows only `releaseName` is available.
     *
     * **Note:** It is not strictly necessary to handle this event. A successfully
     * downloaded update will still be applied the next time the application starts.
     */
    fun on(event: AutoUpdaterEvent.UPDATE_DOWNLOADED, listener: (event: Event, releaseNotes: String, releaseName: String, releaseDate: Date, updateURL: String) -> Unit): Unit /* this */

    /**
     * Emitted when there is no available update.
     */
    fun on(event: AutoUpdaterEvent.UPDATE_NOT_AVAILABLE, listener: Function<*>): Unit /* this */
    fun once(event: AutoUpdaterEvent.BEFORE_QUIT_FOR_UPDATE, listener: Function<*>): Unit /* this */
    fun once(event: AutoUpdaterEvent.CHECKING_FOR_UPDATE, listener: Function<*>): Unit /* this */
    fun once(event: AutoUpdaterEvent.ERROR, listener: (error: Throwable /* JsError */) -> Unit): Unit /* this */
    fun once(event: AutoUpdaterEvent.UPDATE_AVAILABLE, listener: Function<*>): Unit /* this */
    fun once(event: AutoUpdaterEvent.UPDATE_DOWNLOADED, listener: (event: Event, releaseNotes: String, releaseName: String, releaseDate: Date, updateURL: String) -> Unit): Unit /* this */
    fun once(event: AutoUpdaterEvent.UPDATE_NOT_AVAILABLE, listener: Function<*>): Unit /* this */
    fun addListener(event: AutoUpdaterEvent.BEFORE_QUIT_FOR_UPDATE, listener: Function<*>): Unit /* this */
    fun addListener(event: AutoUpdaterEvent.CHECKING_FOR_UPDATE, listener: Function<*>): Unit /* this */
    fun addListener(event: AutoUpdaterEvent.ERROR, listener: (error: Throwable /* JsError */) -> Unit): Unit /* this */
    fun addListener(event: AutoUpdaterEvent.UPDATE_AVAILABLE, listener: Function<*>): Unit /* this */
    fun addListener(event: AutoUpdaterEvent.UPDATE_DOWNLOADED, listener: (event: Event, releaseNotes: String, releaseName: String, releaseDate: Date, updateURL: String) -> Unit): Unit /* this */
    fun addListener(event: AutoUpdaterEvent.UPDATE_NOT_AVAILABLE, listener: Function<*>): Unit /* this */
    fun removeListener(event: AutoUpdaterEvent.BEFORE_QUIT_FOR_UPDATE, listener: Function<*>): Unit /* this */
    fun removeListener(event: AutoUpdaterEvent.CHECKING_FOR_UPDATE, listener: Function<*>): Unit /* this */
    fun removeListener(event: AutoUpdaterEvent.ERROR, listener: (error: Throwable /* JsError */) -> Unit): Unit /* this */
    fun removeListener(event: AutoUpdaterEvent.UPDATE_AVAILABLE, listener: Function<*>): Unit /* this */
    fun removeListener(event: AutoUpdaterEvent.UPDATE_DOWNLOADED, listener: (event: Event, releaseNotes: String, releaseName: String, releaseDate: Date, updateURL: String) -> Unit): Unit /* this */
    fun removeListener(event: AutoUpdaterEvent.UPDATE_NOT_AVAILABLE, listener: Function<*>): Unit /* this */

    /**
     * Asks the server whether there is an update. You must call `setFeedURL` before
     * using this API.
     *
     * **Note:** If an update is available it will be downloaded automatically. Calling
     * `autoUpdater.checkForUpdates()` twice will download the update two times.
     */
    fun checkForUpdates(): Unit

    /**
     * The current update feed URL.
     */
    fun getFeedURL(): String

    /**
     * Restarts the app and installs the update after it has been downloaded. It should
     * only be called after `update-downloaded` has been emitted.
     *
     * Under the hood calling `autoUpdater.quitAndInstall()` will close all application
     * windows first, and automatically call `app.quit()` after all windows have been
     * closed.
     *
     * **Note:** It is not strictly necessary to call this function to apply an update,
     * as a successfully downloaded update will always be applied the next time the
     * application starts.
     */
    fun quitAndInstall(): Unit

    /**
     * Sets the `url` and initialize the auto updater.
     */
    fun setFeedURL(options: FeedURLOptions): Unit
}
