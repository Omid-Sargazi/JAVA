package SOLID.Vehicle;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }
}
