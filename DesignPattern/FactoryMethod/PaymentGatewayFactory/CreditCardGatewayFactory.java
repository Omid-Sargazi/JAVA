package DesignPattern.FactoryMethod.PaymentGatewayFactory;

public class CreditCardGatewayFactory implements PaymentGatewayFactory {
    @Override
    public PaymentGateway createPaymentGateway() {
        return new CreditCardGateway();
    }

}
