package Composition;

public class Engine {
    String type;

    public Engine(String type) {
        this.type = type;
    }
}

class Car {
    String model;
    Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void display() {
        System.out.println(model + "has a" + engine.type + " engine");
    }
}

class Driver {
    String name;

    public Driver(String name) {
        this.name = name;
    }

    public void driver(Car car) {
        System.out.println(name + " is driving " + car.model);
    }
}
