package ECommerceSystem;

public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Paid " + amount + " using PayPal");
    }
}
