package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeObjectProtypeRegistry {
    Map<ShapeType, Shape> shapeMap = new HashMap<>();

    public void registerShape(ShapeType shapeType, Shape shape){
        shapeMap.put(shapeType, shape);
    }

    public Shape getShape(ShapeType shapeType){
        Shape shape = shapeMap.get(shapeType);
        if (shape != null) {
            return shape.clone();
        }
        throw new IllegalArgumentException("Shape Type not found");
    }
}
