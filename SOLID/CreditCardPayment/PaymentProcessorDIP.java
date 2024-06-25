package SOLID.CreditCardPayment;

public class PaymentProcessorDIP {
    private PaymentMethod paymentMethod;

    public PaymentProcessorDIP(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void process(double amount) {
        paymentMethod.processPayment(amount);
    }
}
