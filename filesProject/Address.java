package filesProject;

class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Employee {
    String name;
    Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void Display() {
        System.out.println(name + "Lives in" + address.city + ", " + address.state + " , " + address.country);
    }
}
