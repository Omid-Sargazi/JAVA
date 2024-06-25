package SOLID.RectangleOCP;

public class CircleOCP implements Shape {
    private double radius;

    public CircleOCP(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return Math.PI * radius * radius;
    }

}