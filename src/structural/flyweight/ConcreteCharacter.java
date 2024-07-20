package structural.flyweight;

// Concrete Flyweight
public class ConcreteCharacter implements Character {
    private char symbol;
    private String font;
    private int size;
    private String color;

    public ConcreteCharacter(char symbol, String font, int size, String color) {
        this.symbol = symbol;
        this.font = font;
        this.size = size;
        this.color = color;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying Character [Symbol: " + symbol + ", Font: " + font + ", Size: " + size + ", Color: " + color + ", x: " + x + ", y: " + y + "]");
    }
}


