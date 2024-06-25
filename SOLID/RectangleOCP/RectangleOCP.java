package SOLID.RectangleOCP;

public class RectangleOCP implements Shape {
    private double length;
    private double width;

    public RectangleOCP(double length, double width) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return length * width;
    }
}
