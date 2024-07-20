package structural.decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5; // cost of sugar
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}