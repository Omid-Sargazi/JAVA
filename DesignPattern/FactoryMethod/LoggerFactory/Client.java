package DesignPattern.FactoryMethod.LoggerFactory;

public class Client {
    public static void main(String[] args) {
        LoggerFactory factory = new ConsoleLoggerFactory();
        Logger logger = factory.createLogger();
        logger.log("Hello Factory Method Pattern!");
    }
}
