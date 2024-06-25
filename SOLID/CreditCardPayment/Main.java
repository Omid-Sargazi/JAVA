package SOLID.CreditCardPayment;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.process(100.0);
    }
}
