package SOLID.RestaurantFactoryPattern;

public class Pizza implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing a Pizza");
    }
}
