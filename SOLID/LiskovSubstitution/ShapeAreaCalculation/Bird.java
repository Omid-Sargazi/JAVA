package SOLID.LiskovSubstitution.ShapeAreaCalculation;

public class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Sparrow extends Bird {
};

class Ostrich extends Bird {
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}
