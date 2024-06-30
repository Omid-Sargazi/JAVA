package OnlineShoppingSystem;

public class PayPal implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
