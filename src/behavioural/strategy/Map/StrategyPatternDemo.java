package behavioural.strategy.Map;

// Client
public class StrategyPatternDemo {
    public static void main(String[] args) {
        MapApplication mapApp = new MapApplication();

        // Calculate the fastest route
        mapApp.setDrivingStrategy(new FastestRoute());
        mapApp.calculateRoute("New York", "Los Angeles");

        // Calculate the shortest route
        mapApp.setDrivingStrategy(new ShortestRoute());
        mapApp.calculateRoute("New York", "Los Angeles");

        // Calculate the scenic route
        mapApp.setDrivingStrategy(new ScenicRoute());
        mapApp.calculateRoute("New York", "Los Angeles");

        // Calculate the eco-friendly route
        mapApp.setDrivingStrategy(new EcoFriendlyRoute());
        mapApp.calculateRoute("New York", "Los Angeles");
    }
}

