package ECommerceSystem;

public class ClearanceDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        // TODO Auto-generated method stub
        return price * 0.5;
    }
}
