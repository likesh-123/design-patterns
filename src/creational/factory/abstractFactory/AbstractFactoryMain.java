package creational.factory.abstractFactory;

/*

The Abstract Factory design pattern is a creational pattern that provides an interface for creating families of
related or dependent objects without specifying their concrete classes. This pattern is particularly useful when
 you need to create multiple objects that belong to the same family or theme.

 */

public class AbstractFactoryMain {
    private Vehicle vehicle;
    private Engine engine;
    private Tire tire;

    public AbstractFactoryMain(VehicleFactory factory) {
        vehicle = factory.createVehicle();
        engine = factory.createEngine();
        tire = factory.createTire();
    }

    public void run() {
        vehicle.drive();
        engine.start();
        tire.inflate();
    }

    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        AbstractFactoryMain carClient = new AbstractFactoryMain(carFactory);
        carClient.run();
        // Output:
        // Driving a car...
        // Starting car engine...
        // Inflating car tire...

        VehicleFactory bikeFactory = new BikeFactory();
        AbstractFactoryMain bikeClient = new AbstractFactoryMain(bikeFactory);
        bikeClient.run();
        // Output:
        // Riding a bike...
        // Starting bike engine...
        // Inflating bike tire...
    }
}

