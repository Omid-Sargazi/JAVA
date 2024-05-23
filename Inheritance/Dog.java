package Inheritance;

public class Dog extends animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark...");
    }
}
