package filesProject;

public class OpenClosedPrinciple {
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("creditCard")) {
            // Process credit card payment
        } else if (paymentType.equals("paypal")) {
            // Process PayPal payment
        }
        // More payment types could require modifications here
    }
}
