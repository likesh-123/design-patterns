Key Concepts
- Strategy Interface: Defines a common interface for all driving strategies.
- Concrete Strategies: Implement the strategy interface, providing different driving strategies.
- Context: Uses a reference to a strategy object to execute the route calculation defined by the strategy.

Explanation
- Strategy Interface (DrivingStrategy): Defines the common interface for different driving strategies with a calculateRoute method.
- Concrete Strategies: Implement different driving strategies:
FastestRoute: Implements the fastest route calculation.
ShortestRoute: Implements the shortest route calculation.
ScenicRoute: Implements the most scenic route calculation.
- Context (MapApplication): Holds a reference to a driving strategy and uses it to calculate the route.
- Client (StrategyPatternDemo): Uses the MapApplication and sets different driving strategies to calculate the routes.