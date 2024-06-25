package SOLID.RectangleOCP;

class Rectangle {
    public double length;
    public double width;

}

class Circle {
    public double radius;
}

class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.length * rectangle.width;
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        }
        return 0;
    }
}
