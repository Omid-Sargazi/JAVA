package Inheritance02;

public class Animal {
    void sound() {
        System.out.println("some sound");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
