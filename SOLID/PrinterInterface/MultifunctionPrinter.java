package SOLID.PrinterInterface;

public class MultifunctionPrinter implements Printer {
    @Override
    public void scan() {
        System.out.println("Scanning a document");
    }

    @Override
    public void print() {
        System.out.println("Printing a document");
    }

    @Override
    public void fax() {
        System.out.println("Faxing a document");
    }
}
