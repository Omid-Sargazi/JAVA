package Inheritance02;

public class Animal002 {
    void sound() {
        System.out.println("some sound.");
    }
}

class Dog extends Animal002 {
    @Override
    void sound() {
        super.sound();
        System.out.println("bark.02" + "Inheritance02");
    }
}
