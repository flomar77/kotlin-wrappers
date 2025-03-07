package electron.core


external interface Payment {
    /**
     * The identifier of the purchased product.
     */
    var productIdentifier: String

    /**
     * The quantity purchased.
     */
    var quantity: Double

    /**
     * An opaque identifier for the user’s account on your system.
     */
    var applicationUsername: String

    /**
     * The details of the discount offer to apply to the payment.
     */
    var paymentDiscount: PaymentDiscount?
}
