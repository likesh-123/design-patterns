package structural.flyweight;

// Client
public class FlyweightPatternDemo {
    private static final String[] fonts = { "Arial", "Verdana", "Times New Roman" };
    private static final int[] sizes = { 10, 12, 14, 16 };
    private static final String[] colors = { "Black", "White", "Red", "Green", "Blue" };

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Character character = CharacterFactory.getCharacter(getRandomSymbol(), getRandomFont(), getRandomSize(), getRandomColor());
                character.display(i, j);
            }
        }
    }

    private static char getRandomSymbol() {
        return (char) (Math.random() * 26 + 'A');
    }

    private static String getRandomFont() {
        return fonts[(int) (Math.random() * fonts.length)];
    }

    private static int getRandomSize() {
        return sizes[(int) (Math.random() * sizes.length)];
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}

