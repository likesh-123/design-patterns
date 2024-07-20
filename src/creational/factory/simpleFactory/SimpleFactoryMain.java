package creational.factory.simpleFactory;

/*

The simple factory design pattern is a creational design pattern that provides a way to encapsulate the instantiation
 of objects. It's not one of the "Gang of Four" design patterns but is a useful concept often used in software design.
 The idea is to have a separate object, called a factory, that creates instances of various classes based on
 provided input.

 */

public class SimpleFactoryMain {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("car");
        car.drive();  // Output: Driving a car...

        Vehicle bike = VehicleFactory.createVehicle("bike");
        bike.drive(); // Output: Riding a bike...
    }
}
