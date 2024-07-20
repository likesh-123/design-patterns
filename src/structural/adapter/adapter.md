🔌 Motivation for Adapter pattern

- Adapter pattern is used to convert the interface of a class into another interface that the client expects. It allows classes with incompatible interfaces to work together.
- This is a very common use case when we are working with third-party libraries. We can use the adapter pattern to make the third-party library compatible with our code.
- It allows us to have a uniform interface for different implementations and a single data format for different data sources.


🪛 Implementation of Adapter pattern

- Step 1 - Adapter interface - Add an adapter interface with the methods that the client expects.
- Step 2 - Concrete adapters class - Create an adapter class that implements the adapter interface for each third-party library.
- Step 3 - Adapt to the third-party library - Transform the request to the format that the original class expects and delegate the request to the original class. Similarly, transform the response to the format that the client expects and return the response to the client.

Key Concepts
- Target Interface: This is the interface that the client expects (e.g., PaymentProcessor).
- Adaptee: The existing interfaces that need adapting (e.g., PayPalGateway, StripeGateway).
- Adapter: The class that implements the target interface and translates calls to the adaptee interface.

Explanation
- Target Interface (PaymentProcessor): Defines the processPayment method that the client code expects to call.
- Adaptee (PayPalGateway, StripeGateway): Existing classes that have specific methods for processing payments.
- Adapter (PayPalAdapter, StripeAdapter): Implement the PaymentProcessor interface and translate the method calls from the PaymentProcessor interface to the respective methods of the adaptees.
- Client Code (ECommerceApplication): Uses the PaymentProcessor interface to process payments. It is decoupled from the specific implementations of the payment gateways and interacts only with the PaymentProcessor interface.