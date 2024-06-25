package SOLID.RectangleOCP;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new RectangleOCP(5, 10);
        Shape circle = new CircleOCP(7);

        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println("Rectangle area: " + areaCalculator.calculateArea(rectangle));
        System.out.println("Circle area: " + areaCalculator.calculateArea(circle));
        System.out.println("k");
    }
}
