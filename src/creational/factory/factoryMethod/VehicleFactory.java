package creational.factory.factoryMethod;

public abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public void someOperation() {
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}
