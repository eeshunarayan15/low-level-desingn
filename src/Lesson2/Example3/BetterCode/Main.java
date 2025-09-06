package Lesson2.Example3.BetterCode;

public class Main {
    public static void main(String[] args) {
      ReportGenerator reportGenerator =  new PdfReportGeneratoriImpl();
      reportGenerator.reportGenerator();
      reportGenerator = new WordReportGeneratorImpl();
      reportGenerator.reportGenerator();
    }
}
