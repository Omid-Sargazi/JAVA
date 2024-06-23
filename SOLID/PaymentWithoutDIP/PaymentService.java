package SOLID.PaymentWithoutDIP;

public class PaymentService {
    private CreditCardProcessor creditCardProcessor = new CreditCardProcessor();

    public void processPayment(double amount) {
        creditCardProcessor.process(amount);
    }
}
