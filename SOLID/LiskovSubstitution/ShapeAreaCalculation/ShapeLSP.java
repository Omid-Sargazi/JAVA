package SOLID.LiskovSubstitution.ShapeAreaCalculation;

abstract class ShapeLSP {
    public abstract double area();
}

class RectangleLSP extends ShapeLSP {
    private double width;
    private double height;

    public RectangleLSP(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double area() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
