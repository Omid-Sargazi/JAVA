package SOLID.PaymentWithoutDIP;

public class Main {
    public static void main(String[] args) {
        CreditCardProcessorDIP processor = new CreditCardProcessorDIP();
        PaymentServiceDIP paymentService = new PaymentServiceDIP(processor);
        paymentService.processPayment(100.0);

    }
}
