package structural.adapter;

// Client class
public class ECommerceApplication {
    private PaymentProcessor paymentProcessor;

    public ECommerceApplication(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void makePayment(double amount) {
        paymentProcessor.processPayment(amount);
    }

    public static void main(String[] args) {
        PaymentProcessor payPalProcessor = new PayPalAdapter();
        ECommerceApplication app1 = new ECommerceApplication(payPalProcessor);
        app1.makePayment(100.0); // Output: Processing payment of $100.0 through PayPal.

        PaymentProcessor stripeProcessor = new StripeAdapter();
        ECommerceApplication app2 = new ECommerceApplication(stripeProcessor);
        app2.makePayment(200.0); // Output: Processing payment of $200.0 through Stripe.

        PaymentProcessor squareProcessor = new SquareAdapter();
        ECommerceApplication app3 = new ECommerceApplication(squareProcessor);
        app3.makePayment(300.0); // Output: Processing payment of $300.0 through Square.
    }
}

