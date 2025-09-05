package Lesson1.Example3.betterCode;

import Lesson1.Example2.BetterCode.Employee;

public class WordReportGenerator implements ReportGenerator {
    @Override
    public String generateReport(Employee employee) {
        return "Generating Word report for: " + employee.getName();
    }
}
