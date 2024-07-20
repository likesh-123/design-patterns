package creational.prototype;

public class PrototypeRegistryMain {
    public static void main(String[] args){
        ShapeObjectProtypeRegistry shapeObjectProtypeRegistry = new ShapeObjectProtypeRegistry();

        // Register prototypes
        shapeObjectProtypeRegistry.registerShape(ShapeType.CIRCLE, new Circle(5));
        shapeObjectProtypeRegistry.registerShape(ShapeType.RECTANGLE, new Rectangle(4, 6));
        shapeObjectProtypeRegistry.registerShape(ShapeType.TRIANGLE, new Triangle(3, 5));

        // Clone and use prototypes
        Shape clonedCircle = shapeObjectProtypeRegistry.getShape(ShapeType.CIRCLE);
        clonedCircle.draw();  // Output: Drawing a circle with radius 5

        Shape clonedRectangle = shapeObjectProtypeRegistry.getShape(ShapeType.RECTANGLE);
        clonedRectangle.draw();  // Output: Drawing a rectangle with width 4 and height 6

        Shape clonedTriangle = shapeObjectProtypeRegistry.getShape(ShapeType.TRIANGLE);
        clonedTriangle.draw();  // Output: Drawing a triangle with base 3 and height 5

        // Modify cloned shapes and draw again
        ((Circle) clonedCircle).setRadius(10);
        clonedCircle.draw();  // Output: Drawing a circle with radius 10

        ((Rectangle) clonedRectangle).setWidth(8);
        clonedRectangle.draw();  // Output: Drawing a rectangle with width 8 and height 6

        ((Triangle) clonedTriangle).setBase(6);
        clonedTriangle.draw();  // Output: Drawing a triangle with base 6 and height 5

    }
}
