Key Concepts
- Strategy Interface: Defines a common interface for all supported algorithms.
- Concrete Strategies: Implement the strategy interface, providing different behaviors.
- Context: Uses a reference to a strategy object to execute the algorithm defined by the strategy.

Explanation
- Strategy Interface (PaymentStrategy): Defines the common interface for payment methods with a pay method.
- Concrete Strategies: Implement different payment methods:
CreditCardPayment: Implements payment via credit card.
PayPalPayment: Implements payment via PayPal.
BankTransferPayment: Implements payment via bank transfer.
- Context (ShoppingCart): Holds items and a reference to the payment strategy. The checkout method uses the current strategy to perform the payment.
- Client (StrategyPatternDemo): Uses the ShoppingCart and sets different payment strategies to perform payments.