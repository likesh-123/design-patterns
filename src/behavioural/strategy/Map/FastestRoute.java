package behavioural.strategy.Map;

// Concrete Strategy 1: Fastest Route
public class FastestRoute implements DrivingStrategy {
    @Override
    public void calculateRoute(String from, String to) {
        System.out.println("Calculating the fastest route from " + from + " to " + to);
        // Logic for the fastest route
    }
}