package DesignPattern.FactoryMethod.PaymentGatewayFactory;

public class PaypalGatewayFactory implements PaymentGatewayFactory {
    @Override
    public PaymentGateway createPaymentGateway() {
        return new PaypalGateway();
    }
}
