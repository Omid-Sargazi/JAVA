package SOLID.RestaurantFactoryPattern.RestaurantWithFactory;

public class Owner implements User {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("User: " + name + ", Type: Owner");
    }
}
