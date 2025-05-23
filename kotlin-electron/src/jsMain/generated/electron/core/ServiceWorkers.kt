@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter


external class ServiceWorkers : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/service-workers
    /**
     * Emitted when a service worker logs something to the console.
     */
    fun on(
        event: ServiceWorkersEvent.CONSOLE_MESSAGE, listener: (
            event: Event,
            /**
             * Information about the console message
             */
            messageDetails: MessageDetails
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when a service worker has been registered. Can occur after a call to
     * `navigator.serviceWorker.register('/sw.js')` successfully resolves or when a
     * Chrome extension is loaded.
     */
    fun on(
        event: ServiceWorkersEvent.REGISTRATION_COMPLETED, listener: (
            event: Event,
            /**
             * Information about the registered service worker
             */
            details: RegistrationCompletedDetails
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: ServiceWorkersEvent.CONSOLE_MESSAGE, listener: (
            event: Event,
            /**
             * Information about the console message
             */
            messageDetails: MessageDetails
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: ServiceWorkersEvent.REGISTRATION_COMPLETED, listener: (
            event: Event,
            /**
             * Information about the registered service worker
             */
            details: RegistrationCompletedDetails
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: ServiceWorkersEvent.CONSOLE_MESSAGE, listener: (
            event: Event,
            /**
             * Information about the console message
             */
            messageDetails: MessageDetails
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: ServiceWorkersEvent.REGISTRATION_COMPLETED, listener: (
            event: Event,
            /**
             * Information about the registered service worker
             */
            details: RegistrationCompletedDetails
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: ServiceWorkersEvent.CONSOLE_MESSAGE, listener: (
            event: Event,
            /**
             * Information about the console message
             */
            messageDetails: MessageDetails
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: ServiceWorkersEvent.REGISTRATION_COMPLETED, listener: (
            event: Event,
            /**
             * Information about the registered service worker
             */
            details: RegistrationCompletedDetails
        ) -> Unit
    ): Unit /* this */

    /**
     * A ServiceWorkerInfo object where the keys are the service worker version ID and
     * the values are the information about that service worker.
     */
    fun getAllRunning(): js.core.ReadonlyRecord<Double, ServiceWorkerInfo>

    /**
     * Information about this service worker
     *
     * If the service worker does not exist or is not running this method will throw an
     * exception.
     */
    fun getFromVersionID(versionId: Double): ServiceWorkerInfo
}
