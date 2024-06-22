package DesignPattern.DocumentProcessingFactory;

public class Client {
    public static void main(String[] args) {
        DocumentFactory factory = new PDFDocumentFactory();
        Document document = factory.createDocument();
        document.open();
        document.close();
    }
}
