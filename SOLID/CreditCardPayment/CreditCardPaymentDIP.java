package SOLID.CreditCardPayment;

public class CreditCardPaymentDIP implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Processing credit card payment of $" + amount);

    }
}
