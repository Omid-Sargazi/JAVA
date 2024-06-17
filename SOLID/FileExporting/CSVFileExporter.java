package SOLID.FileExporting;

public class CSVFileExporter implements MainFileExporter {
    @Override
    public void export(String content) {
        System.out.println("Exporting CSV with content: " + content);
    }
}
