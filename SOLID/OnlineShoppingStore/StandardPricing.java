package SOLID.OnlineShoppingStore;

public class StandardPricing implements PricingStrategy {
    @Override
    public double calculatePrice(OrderSOLID order) {
        // TODO Auto-generated method stub
        return order.geProduct().getPrice() * order.getQuantity();
    }

}
