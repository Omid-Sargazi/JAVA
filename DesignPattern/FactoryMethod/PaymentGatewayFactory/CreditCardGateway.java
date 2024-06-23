package DesignPattern.FactoryMethod.PaymentGatewayFactory;

public class CreditCardGateway implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paying via Credit Card: $" + amount);
    }
}
