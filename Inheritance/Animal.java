package Inheritance;

class Animal {
    void eat() {
        System.out.println("This animal eats food...");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }

}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog bark...");
    }
}
