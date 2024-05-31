package filesProject;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        System.out.println(" //////////////////////////////" + "Aggregation");
        Address address = new Address("New Your", "NY", "USA");
        Employee employee = new Employee("Omid ", address);
        employee.Display();

        System.out.println(" //////////////////////////////" + "Association");
        Library library = new Library("City Library");
        Student student = new Student("Omid");
        student.borrowBook(library);

        System.out.println(" //////////////////////////////" + "Composition");
        Car car = new Car();
        car.startCar();

        System.out.println(" //////////////////////////////" + "Polymorphism");

        Shape shape;
        shape = new Circle();
        shape.draw();
        shape = new Cube();
        shape.draw();

    }
}
