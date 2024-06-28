package SOLID.RestaurantFactoryPattern.RestaurantWithFactory;

public class Customer implements User {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("User: " + name + ", Type: Customer");
    }
}
