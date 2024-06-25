package SOLID.LSPBird;

public class FlyingBird extends BirdLSP {
    @Override
    public void move() {
        fly();
    }

    public void fly() {
        System.out.println("Flying");
    }
}
