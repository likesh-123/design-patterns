package creational.factory.simpleFactory;

public class SimpleFactoryMain {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("car");
        car.drive();  // Output: Driving a car...

        Vehicle bike = VehicleFactory.createVehicle("bike");
        bike.drive(); // Output: Riding a bike...
    }
}
