package SOLID.ShapeFactory;

public class ShapeFactory {
    public static Shape createShape(String shapeName) {
        if (shapeName == null) {
            return null;
        } else if (shapeName.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeName.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        return null;
    }
}
