package structural.decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
        // Output: Simple Coffee $5.0

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
        // Output: Simple Coffee, Milk $6.5

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
        // Output: Simple Coffee, Milk, Sugar $7.0

        coffee = new WhippedCreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
        // Output: Simple Coffee, Milk, Sugar, Whipped Cream $9.0
    }
}

