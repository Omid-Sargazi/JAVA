package Aggregation;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("New Yourk", "NY");
        Person person = new Person("Omid Sargazi", address);
        person.display();
    }
}
