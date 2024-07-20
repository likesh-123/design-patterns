🎨 Motivation for Decorator pattern

- Decorator pattern is used to add additional functionality to an object dynamically without changing its structure.
- It is a structural pattern that allows us to add new behaviors to an object by placing these objects inside special wrapper objects that contain the behaviors.
- Inheritance is static and applies to an entire class of objects. Decorator pattern allows us to add new behaviors to an object dynamically at runtime.
- Often, we require a lot of different combinations of behaviors. In such cases, we can use the decorator pattern to create a decorator for each behavior and combine them as needed. For example, we can create a decorator for each type of pizza topping and combine them to create different types of pizzas

🪑 Implementation of Decorator pattern

- Step 1 - Create a common product interface.
- Step 2 - Create the concrete products.
- Step 3 - Create a base decorator class that extends the product interface and has a reference to the product interface.
- Step 4 - Create concrete decorators that extend the base decorator class and add additional functionality to the product interface.

Key Concepts
- Component Interface: Defines the interface for objects that can have responsibilities added to them dynamically.
- Concrete Component: The class that is being decorated.
- Decorator: Implements the component interface and has a reference to a component object.
- Concrete Decorators: Extend the functionality of the component by adding responsibilities.

Explanation
- Component Interface (Coffee): Defines the methods getCost and getDescription that will be implemented by the concrete component and decorators.
- Concrete Component (SimpleCoffee): Implements the Coffee interface and provides the basic coffee functionality.
- Decorator (CoffeeDecorator): Implements the Coffee interface and holds a reference to a Coffee object. It delegates the calls to the wrapped object.
- Concrete Decorators (MilkDecorator, SugarDecorator, WhippedCreamDecorator): Extend the CoffeeDecorator class and override the methods to add their specific functionalities.
- Client Code (CoffeeShop): Demonstrates how to dynamically add functionalities to a Coffee object using decorators.