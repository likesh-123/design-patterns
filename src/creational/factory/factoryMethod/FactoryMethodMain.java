package creational.factory.factoryMethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        VehicleFactory carFactory = new BikeFactory();
        carFactory.someOperation();
    }
}
