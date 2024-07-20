🌳 Motivation for the prototype pattern

- The prototype pattern is useful when we want to create multiple objects but creating each object is expensive. It can be expensive because the object is resource-intensive or because it requires a lot of time to create the object.
- The prototype pattern is extremely popular in game development. For example, if we want to create multiple enemies in a game, we can create a prototype enemy and clone it to create multiple enemies. This is much faster than creating each enemy from scratch, since each object might require a lot of resources and time to create.
- The idea behind the prototype pattern is to create a prototype object, clone it to create multiple objects, and then modify the cloned objects as required.

📽️ Implementing the prototype pattern

- Step 1: Create an interface that has a clone method
- Step 2: Create a concrete class that implements the interface
- Step 3: Implement the clone method in the concrete class using shallow or deep cloning
- Step 4: Create a registry class that stores the prototype objects
- Step 5: Create a prototype object and register it in the registry class. Fetch the object from the registry class and clone it to create multiple objects.