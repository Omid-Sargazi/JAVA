package SOLID.PrinterInterface;

public class MultifunctionPrinterISP implements Printable, Scannable, Faxable {
    @Override
    public void fax() {
        // TODO Auto-generated method stub
        System.out.println("Faxing a document");

    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Printing a document");

    }

    @Override
    public void scan() {
        // TODO Auto-generated method stub
        System.out.println("Scanning a document");

    }
}
