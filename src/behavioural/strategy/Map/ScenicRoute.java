package behavioural.strategy.Map;

// Concrete Strategy 3: Scenic Route
public class ScenicRoute implements DrivingStrategy {
    @Override
    public void calculateRoute(String from, String to) {
        System.out.println("Calculating the most scenic route from " + from + " to " + to);
        // Logic for the scenic route
    }
}
