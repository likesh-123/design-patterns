package behavioural.strategy.Map;

// Context
public class MapApplication {
    private DrivingStrategy drivingStrategy;

    public void setDrivingStrategy(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }

    public void calculateRoute(String from, String to) {
        drivingStrategy.calculateRoute(from, to);
    }
}
