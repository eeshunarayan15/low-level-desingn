package Lesson1.Example3.betterCode;

import Lesson1.Example2.BetterCode.Employee;

public class PdfReportGenerator implements ReportGenerator {
    @Override
    public String generateReport(Employee employee) {
        return "Generating PDF report for: " + employee.getName();
    }
}
