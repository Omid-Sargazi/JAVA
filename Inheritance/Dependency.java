package Inheritance;

public class Dependency {
    public static void main(String[] args) {
        System.out.println("Dependency");
        Printer printer = new Printer();
        Computer computer = new Computer();
        computer.printDocument(printer, "Hello world");

    }
}

class Printer {
    public void print(String doc) {
        System.out.println("Printing document: " + doc);
    }
}

class Computer {
    public void printDocument(Printer printer, String doc) {
        printer.print(doc);
    }
}