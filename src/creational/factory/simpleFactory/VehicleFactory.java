package creational.factory.simpleFactory;

public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        if(type.equalsIgnoreCase("Car")){
            return new Car();
        }else  if(type.equalsIgnoreCase("Bike")){
            return new Bike();
        }
        return null;
    }
}
