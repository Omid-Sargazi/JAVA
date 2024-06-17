package SOLID.FileExporting;

public class PDFFileExporter implements MainFileExporter {
    @Override
    public void export(String content) {
        System.out.println("Exporting PDF with content: " + content);
    }
}
