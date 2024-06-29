package ECommerceSystem;

public class SeasonalDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        // TODO Auto-generated method stub
        return price * 0.9;
    }
}
