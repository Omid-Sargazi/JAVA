package SOLID.FileExporting;

public class FileExporter {
    public void exportFile(String type, String content) {
        if (type.equals("pdf")) {
            exportPDF(content);
        } else if (type.equals("csv")) {
            exportCSV(content);
        } else {
            throw new IllegalArgumentException("Unknown file type");
        }
    }

    private void exportPDF(String content) {
        System.out.println("Exporting PDF with content: " + content);
    }

    private void exportCSV(String content) {
        System.out.println("Exporting CSV with content: " + content);
    }
}
