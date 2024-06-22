package DesignPattern.foodorderingFactoryPattern;

public class Client {
    public static void main(String[] args) {
        DishFactory pizzaFactory = new PizzaFactory();
        Dish pizza = pizzaFactory.createDish();
        pizza.prepare();
    }
}
