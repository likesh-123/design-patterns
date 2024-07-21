package behavioural.strategy.Bank;

// Client
public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("Book", 10);
        Item item2 = new Item("Pen", 2);

        cart.addItem(item1);
        cart.addItem(item2);

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("John Doe", "1234567890123456", "123", "12/23"));
        cart.checkout();

        // Pay using PayPal
        cart.setPaymentStrategy(new PayPalPayment("john.doe@example.com", "password"));
        cart.checkout();

        // Pay using Bank Transfer
        cart.setPaymentStrategy(new BankTransferPayment("123456789", "987654321"));
        cart.checkout();

        // Pay using Bitcoin
        cart.setPaymentStrategy(new BitcoinPayment("1A2B3C4D5E6F7G8H9I0J"));
        cart.checkout();
    }
}

