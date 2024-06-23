package SOLID.PaymentWithoutDIP;

public class PaymentServiceDIP {
    private PaymentProcessor paymentProcessor;

    public PaymentServiceDIP(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processPayment(double amount) {
        paymentProcessor.process(amount);
    }
}
