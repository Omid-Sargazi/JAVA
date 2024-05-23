package Composition;

public class ComposiAssociaDepend {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Car car = new Car("Ford Mustang", engine);
        car.display();

        Driver driver = new Driver("Alice");
        driver.driver(car);
    }
}
