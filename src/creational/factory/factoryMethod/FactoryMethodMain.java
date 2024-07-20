package creational.factory.factoryMethod;

/*

The Factory Method design pattern is a creational pattern that defines an interface for creating an object but allows
 subclasses to alter the type of objects that will be created. This pattern delegates the instantiation logic to
 subclasses, promoting greater flexibility and scalability compared to the Simple Factory pattern.

 */

public class FactoryMethodMain {
    public static void main(String[] args) {
        VehicleFactory carFactory = new BikeFactory();
        carFactory.someOperation();
    }
}
