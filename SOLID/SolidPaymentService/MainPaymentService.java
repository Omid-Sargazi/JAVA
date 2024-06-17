package SOLID.SolidPaymentService;

import java.util.HashMap;
import java.util.Map;

public class MainPaymentService {
    private final Map<String, PaymentProcessor> processors;

    public MainPaymentService() {
        processors = new HashMap<>();
        processors.put("creditCard", new CreditCardPaymentProcessor());
        processors.put("paypal", new PayPalPaymentProcessor());
    }

    public void processPayment(String type, double amount) {
        PaymentProcessor processor = processors.get(type);
        if (processor != null) {
            processor.process(amount);
        } else {
            throw new IllegalArgumentException("Unknown payment type");
        }
    }
}
