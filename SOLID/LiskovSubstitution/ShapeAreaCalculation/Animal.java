package SOLID.LiskovSubstitution.ShapeAreaCalculation;

/**
 * Animal
 */
public class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Snake extends Animal {
    public void makeSound() {
        throw new UnsupportedOperationException("Snakes don't make this type of sound");
    }
}