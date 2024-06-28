package SOLID.RestaurantFactoryPattern.RestaurantWithFactory;

import java.util.Date;

public class Order {
    private User customer;
    private Food food;
    private Date orderDate;

    public Order(User customer, Food food) {
        this.customer = customer;
        this.food = food;
        this.orderDate = new Date();
    }

    public void showOrderDetails() {
        customer.showDetails();
        food.prepare();
        System.out.println("Order Date: " + orderDate);
    }
}
