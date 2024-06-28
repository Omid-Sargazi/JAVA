package SOLID.RestaurantFactoryPattern.RestaurantWithFactory;

public class Salad implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing a Salad");
    }
}
