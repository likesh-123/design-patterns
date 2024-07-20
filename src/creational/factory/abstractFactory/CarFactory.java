package creational.factory.abstractFactory;

public class CarFactory implements VehicleFactory{
    public Vehicle createVehicle(){
        return new Car();
    };

    public Engine createEngine(){
        return new CarEngine();
    };

    public Tire createTire(){
        return new CarTire();
    };
}
