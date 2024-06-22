package DesignPattern.VehicleFactoryPattern;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started");
    }

    public void stop() {
        System.out.println("Bike stopped");
    }
}
