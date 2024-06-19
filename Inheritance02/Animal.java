package Inheritance02;

public class Animal {
    void sound() {
        System.out.println("some sound");
    }

}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark....");
    }
}
