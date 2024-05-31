package filesProject;

public class Engine {
    void start() {
        System.out.println("Engine starts.");
    }
}

class Car {
    private final Engine engine;

    public Car() {
        engine = new Engine();
    }

    void startCar() {
        engine.start();
        System.out.println("Car Starts");
    }

}