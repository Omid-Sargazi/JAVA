package SOLID.CreditCardPayment;

public class PaymentProcessor {
    private CreditCardPayment creditCardPayment;

    public PaymentProcessor() {
        this.creditCardPayment = new CreditCardPayment();
    }

    public void process(double amount) {
        creditCardPayment.processPayment(amount);
    }
}
