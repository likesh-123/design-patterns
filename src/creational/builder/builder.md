
- The builder pattern is useful when the object to be created is complex and has many attributes. It is also useful when the object to be created has optional attributes.
- Generally, when we have many attributes, we create a constructor with many parameters. This is called the telescoping constructor anti-pattern. It is an anti-pattern because it is difficult to read and maintain the code.
- The builder pattern also creates immutable objects, which means that the attributes cannot be changed once the object is created. This is useful as it prevents the object from being modified accidentally and also makes the object thread-safe.
- The builder pattern provides us with on-demand construction of objects, global validation of objects, and the ability to create immutable objects.


🪛 Implementing the builder pattern

- The builder pattern is a creational design pattern that is used to create complex objects by separating the construction of the object from its representation.
- It uses the concept of a friend or inner class. The inner class is mutable and is used for the initial setting of the attributes. The outer class is immutable and is used for the final construction of the object.
- Step 1: Create the inner static builder class with the same attributes as the outer class
- Step 2: Add fluent setters to the builder class
- Step 3: Add a build method to the builder class that returns the outer class
- Step 4: Add a validation method to the builder class that validates the attributes before building the object