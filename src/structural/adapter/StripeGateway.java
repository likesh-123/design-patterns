package structural.adapter;

// Adaptee class for Stripe
public class StripeGateway {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}