package SOLID.LiskovSubstitution.ShapeAreaCalculation;

public class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
}

class Boat extends Vehicle {
    public void move() {
        throw new UnsupportedOperationException("Boats can't move on the road");
    }
}