package SOLID.LiskovSubstitution.ShapeAreaCalculation;

public class Printer {
    public void printText() {
        System.out.println("Printing text document");
    }

    public void printImage() {
        throw new UnsupportedOperationException("Printing image is not supported");
    }
}

class TextPrinter extends Printer {
};

class ImagePrinter extends Printer {
    public void printImage() {
        System.out.println("Printing image document");
    }
}
