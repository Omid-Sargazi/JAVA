package SOLID.LiskovSubstitution.ShapeAreaCalculation;

abstract class PrinterLSP {
    public abstract void print();
}

class TextPrinterLSP extends PrinterLSP {
    public void print() {
        System.out.println("Printing text document");
    }
}

class ImagePrinterLSP extends PrinterLSP {
    public void print() {
        System.out.println("Printing image document");
    }
}
