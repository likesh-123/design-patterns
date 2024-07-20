package creational.factory.abstractFactory;

public interface VehicleFactory {
    Vehicle createVehicle();
    Engine createEngine();
    Tire createTire();
}
