package SOLID.SolidPaymentService;

public class PaymentService {
    public void processPayment(String type, double amount) {
        if (type.equals("creditCard")) {
            processCreditCardPayment(amount);
        } else if (type.equals("paypal")) {
            processPayPalPayment(amount);
        } else {
            throw new IllegalArgumentException("Unknown payment type");
        }
    }

    private void processPayPalPayment(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Processing credit card payment of $" + amount);
    }

    private void processCreditCardPayment(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
