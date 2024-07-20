package creational.factory.abstractFactory;

public class BikeFactory implements VehicleFactory{

    public Vehicle createVehicle(){
        return new Bike();
    };

    public Engine createEngine(){
        return new BikeEngine();
    };

    public Tire createTire(){
        return new CarTire();
    };
}
