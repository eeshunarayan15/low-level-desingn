package Lesson1.Example3.betterCode;

import java.util.HashMap;
import java.util.Map;

public class ReportGeneratorFactory {
    private static final Map<ReportType, ReportGenerator> generators = new HashMap<>();
    
    static {

        generators.put(ReportType.PDF, new PdfReportGenerator());
        generators.put(ReportType.WORD, new WordReportGenerator());
    }
    
    public static ReportGenerator getGenerator(ReportType reportType) {
        ReportGenerator generator = generators.get(reportType);
        if (generator == null) {
            throw new UnsupportedOperationException("Report type not supported: " + reportType);
        }
        return generator;
    }
}