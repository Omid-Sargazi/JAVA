package Aggregation;

public class Person {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println(name + "lives in" + address.city + "," + address.state);
    }
}
