package SOLID.PrinterInterface;

public class simplePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing a document");
    }

    @Override
    public void scan() {

    }

    @Override
    public void fax() {

    }
}
