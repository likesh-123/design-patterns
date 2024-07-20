🪰 Motivation for Flyweight pattern

- Flyweight pattern is used to reduce the memory footprint of an application by sharing as much data as possible with other similar objects.
- It is a structural pattern that allows us to share common data across multiple objects instead of keeping all the data in each object.
- It is a good alternative when creating objects. Instead of creating many objects, we can create a single object and share it across multiple objects.

🛫 Implementation of Flyweight pattern

- Step 1 - Create a class for the intrinsic state. These are the properties that are common across multiple objects.
- Step 2 - Create a class for the extrinsic state. These are the properties that are unique to each object.
- Step 3 - Add a reference to the intrinsic state in the extrinsic state class.
- Step 4 - Create a registry class that returns the intrinsic state.

Key Concepts
- Flyweight Interface: Declares an interface through which flyweights can receive and act on extrinsic state.
- Concrete Flyweight: Implements the flyweight interface and adds storage for intrinsic state, which is shared among multiple objects.
- Flyweight Factory: Creates and manages flyweight objects, ensuring that shared objects are reused when needed.
- Client: Maintains references to flyweights and computes or stores extrinsic state.

Explanation
- Flyweight Interface (Circle): Defines the draw method, which is implemented by the concrete flyweight.
- Concrete Flyweight (ConcreteCircle): Implements the Circle interface and contains intrinsic state (color and radius), which is shared.
- Flyweight Factory (CircleFactory): Manages the creation and reuse of flyweight objects. It ensures that circles with the same intrinsic state (color and radius) are reused.
- Client (FlyweightPatternDemo): Uses the factory to get circle objects and draws them on the screen. The client passes extrinsic state (x and y coordinates) to the draw method.