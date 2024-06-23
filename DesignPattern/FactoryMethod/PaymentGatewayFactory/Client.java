package DesignPattern.FactoryMethod.PaymentGatewayFactory;

public class Client {
    public static void main(String[] args) {
        PaymentGatewayFactory factory = new PaypalGatewayFactory();
        PaymentGateway gateway = factory.createPaymentGateway();
        gateway.pay(100.0);

    }
}
