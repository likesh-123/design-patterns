package structural.decorator;

public class VanillaDecorator extends CoffeeDecorator{
    public VanillaDecorator(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 1.0; // cost of vanilla
    }

    public String getDescription() {
        return super.getDescription() + ", Vanilla";
    }
}
