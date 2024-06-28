package SOLID.RestaurantFactoryPattern.RestaurantWithFactory;

public class Burger implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing a Burger");
    }
}
