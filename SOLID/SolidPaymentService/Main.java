package SOLID.SolidPaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentService pay = new PaymentService();
        pay.processPayment("creditCard", 100.0);
        pay.processPayment("paypal", 200.0);
        System.out.println("SOILD");
    }
}
