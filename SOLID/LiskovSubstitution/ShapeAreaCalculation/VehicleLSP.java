package SOLID.LiskovSubstitution.ShapeAreaCalculation;

abstract class VehicleLSP {
    public abstract void move();
}

class CarLSP extends VehicleLSP {
    public void move() {
        System.out.println("Car is moving on the road");
    }
}

class BoatLSP extends VehicleLSP {
    public void move() {
        System.out.println("Boat is moving on the water");
    }
}
