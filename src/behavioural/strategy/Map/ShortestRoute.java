package behavioural.strategy.Map;

// Concrete Strategy 2: Shortest Route
public class ShortestRoute implements DrivingStrategy {
    @Override
    public void calculateRoute(String from, String to) {
        System.out.println("Calculating the shortest route from " + from + " to " + to);
        // Logic for the shortest route
    }
}
