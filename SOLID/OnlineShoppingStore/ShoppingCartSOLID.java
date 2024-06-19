package SOLID.OnlineShoppingStore;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartSOLID implements ShoppingCartOperations {
    private List<OrderSOLID> orders = new ArrayList<>();
    private PricingStrategy pricingStrategy;

    public ShoppingCartSOLID(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void addOrderSolid(OrderSOLID order) {
        orders.add(order);
    }

    public double calculateTotalPriceSOLID() {
        double total = 0;
        for (OrderSOLID order : orders) {
            total += pricingStrategy.calculatePrice(order);
        }
        return total;
    }

    @Override
    public void addOrder(OrderSOLID order) {
        // TODO Auto-generated method stub

    }

    @Override
    public double calculateTotalPrice() {
        // TODO Auto-generated method stub
        return 0;
    }
}
