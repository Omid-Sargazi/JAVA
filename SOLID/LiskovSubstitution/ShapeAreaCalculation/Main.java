package SOLID.LiskovSubstitution.ShapeAreaCalculation;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(2, 3);
        System.out.println("Area " + shape.area());
        shape = new Circle(6);
        System.out.println("Area " + shape.area());

        ShapeLSP shapeLSP = new RectangleLSP(3, 3);
        System.out.println("Area LSP  " + shapeLSP.area());
        //////////////////////////////
        Bird bird = new Sparrow();
        bird.fly();
        bird = new Ostrich();
        bird.fly();

    }

}
