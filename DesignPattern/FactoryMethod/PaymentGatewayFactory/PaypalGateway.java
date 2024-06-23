package DesignPattern.FactoryMethod.PaymentGatewayFactory;

public class PaypalGateway implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paying via PayPal: $" + amount);
    }
}
