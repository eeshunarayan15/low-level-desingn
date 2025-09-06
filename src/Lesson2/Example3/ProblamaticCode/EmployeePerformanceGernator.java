package Lesson2.Example3.ProblamaticCode;

import Lesson1.Example2.BetterCode.Employee;

public class EmployeePerformanceGernator {
    public  String generateReport(String reportType, Employee employee){
        if(reportType.equals("PDF")){
            return  "Generating PDF report";
        }else if(reportType.equals("WORD")){
            return  "Genrating Word report";
        }
        return  "Report type not Supported";
    }
}
