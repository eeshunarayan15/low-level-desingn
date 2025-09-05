package Lesson1.Example3.betterCode;

import Lesson1.Example2.BetterCode.Employee;

public class EmployeePerformanceGenerator {
    
    public String generateReport(ReportType reportType, Employee employee) {
        ReportGenerator generator = ReportGeneratorFactory.getGenerator(reportType);
        return generator.generateReport(employee);
    }
}