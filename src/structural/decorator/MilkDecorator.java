package structural.decorator;

// Concrete Decorator for adding Milk
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5; // cost of milk
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}