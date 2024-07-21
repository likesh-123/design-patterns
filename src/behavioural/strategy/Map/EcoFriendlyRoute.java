package behavioural.strategy.Map;

// Concrete Strategy 4: Eco-Friendly Route
public class EcoFriendlyRoute implements DrivingStrategy {
    @Override
    public void calculateRoute(String from, String to) {
        System.out.println("Calculating the most eco-friendly route from " + from + " to " + to);
        // Logic for the eco-friendly route
    }
}

