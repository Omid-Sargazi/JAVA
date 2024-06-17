package SOLID.FileExporting;

import java.util.HashMap;
import java.util.Map;

public class ExportService {
    private final Map<String, MainFileExporter> exporters;

    public ExportService() {
        exporters = new HashMap<>();
        exporters.put("pdf", new PDFFileExporter());
        exporters.put("csv", new CSVFileExporter());
    }

    public void exportFile(String type, String content) {
        MainFileExporter exporter = exporters.get(type);
        if (exporter != null) {
            exporter.export(content);
        } else {
            throw new IllegalArgumentException("Unknown file type");
        }
    }
}
