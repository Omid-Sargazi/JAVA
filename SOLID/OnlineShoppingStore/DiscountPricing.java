package SOLID.OnlineShoppingStore;

public class DiscountPricing implements PricingStrategy {
    private double discointRate;

    public DiscountPricing(double discointRate) {
        this.discointRate = discointRate;
    }

    @Override
    public double calculatePrice(OrderSOLID order) {
        // TODO Auto-generated method stub
        double standardPrice = order.geProduct().getPrice() * order.getQuantity();

        return standardPrice - (standardPrice * discointRate);
    }
}