package SOLID.SolidPaymentService;

public class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Processing credit card payment of $" + amount);
    }
}
