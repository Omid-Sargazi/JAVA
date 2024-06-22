package DesignPattern;

public class PrinterSpooler {
    private static PrinterSpooler instance;

    private PrinterSpooler() {
    }

    public static synchronized PrinterSpooler getInstance() {
        if (instance == null) {
            instance = new PrinterSpooler();
        }
        return instance;
    }

}
