package DesignPattern.VehicleFactoryPattern;

public class Clinet {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.stop();
        car.start();
    }
}
