package structural.decorator;

public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0; // cost of whipped cream
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whipped Cream";
    }
}