package SOLID.SolidPaymentService;

public class PayPalPaymentProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
