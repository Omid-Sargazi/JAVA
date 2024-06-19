package SOLID.LiskovSubstitution.ShapeAreaCalculation;

abstract class BirdLSP {
}

class FlyingBird extends BirdLSP {
    public void fly() {
        System.out.println("Flying");
    }
}

class SparrowLSP extends FlyingBird {
}

class OstrichLSP extends BirdLSP {
}