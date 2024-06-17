package SOLID.FileExporting;

public class Main {
    public static void main(String[] args) {
        System.out.println("FileExporting;");
        FileExporter fileExporter = new FileExporter();
        fileExporter.exportFile("pdf", "This is a PDF content.");
        fileExporter.exportFile("csv", "This is a CSV content.");
    }
}
