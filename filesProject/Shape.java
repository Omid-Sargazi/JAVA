package filesProject;

//Polymorphism
public class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Cube extends Shape {
    void draw() {
        System.out.println("Drawing a Cube.");

    }
}

class ThreeAngle extends Shape {
    void draw() {
        System.out.println("Drawing a ThreeAngle.");

    }
}
