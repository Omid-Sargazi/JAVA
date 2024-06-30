package SOLID.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.createShape("Circle");
        shape1.draw();
        Shape shape2 = shapeFactory.createShape("Rectangle");
        shape2.draw();
    }
}
