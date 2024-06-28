package SOLID.RestaurantFactoryPattern.RestaurantWithFactory;

public class Pizza implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing a Pizza");
    }
}
