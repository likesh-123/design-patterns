Key Concepts
- Facade: The facade class provides a simple interface to the complex subsystem.
- Subsystem Classes: These are the classes that implement the subsystem's functionality. They handle the details of the work but are hidden behind the facade.
- Client: The client interacts with the facade instead of directly with the subsystem classes.

Explanation
- Subsystem Classes: The DVDPlayer, Projector, Amplifier, and Lights classes represent the various components of the home theater system. Each class has methods to perform specific actions.
- Facade (HomeTheaterFacade): The facade class simplifies the interface by providing watchMovie and endMovie methods. These methods encapsulate the complexity of interacting with the various components.
- Client (FacadePatternDemo): The client uses the facade to control the home theater system. It no longer needs to interact directly with the individual components.