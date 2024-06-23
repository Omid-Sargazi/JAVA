package DesignPattern.FactoryMethod.LoggerFactory;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Logging to file: " + message);
    }
}
