package structural.flyweight;

import java.util.HashMap;

public class CharacterFactory {
    private static final HashMap<String, Character> characterMap = new HashMap<>();

    public static Character getCharacter(char symbol, String font, int size, String color) {
        String key = symbol + "-" + font + "-" + size + "-" + color;
        Character character = characterMap.get(key);

        if(character == null){
            character = new ConcreteCharacter(symbol, font, size, color);
            characterMap.put(key, character);
            System.out.println("Creating Character [Symbol: " + symbol + ", Font: " + font + ", Size: " + size + ", Color: " + color + "]");
        }

        return character;
    }
}
