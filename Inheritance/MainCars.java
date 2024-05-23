package Inheritance;

public class MainCars {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2021;
        myCar.numberOfDoors = 4;

        myCar.startEngine(); // Inherited method
        myCar.openTrunk(); // Specific method
    }
}

class Vehicle {
    String make;
    String model;
    int year;

    public void startEngine() {
        System.out.println("Engine started.");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public void openTrunk() {
        System.out.println("Trunk opened.");
    }
}
