package DesignPattern.foodorderingFactoryPattern;

public class SushiFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new Sushi();
    }
}
