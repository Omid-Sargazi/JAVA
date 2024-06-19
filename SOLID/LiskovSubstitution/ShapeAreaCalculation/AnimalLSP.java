package SOLID.LiskovSubstitution.ShapeAreaCalculation;

abstract class AnimalLSP {
    public abstract void makeSound();
}

class DogLSP extends AnimalLSP {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class SnakeLSP extends AnimalLSP {
    public void makeSound() {
        System.out.println("Hiss");
    }
}