package Lesson1.Example3.betterCode;

import Lesson1.Example2.BetterCode.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeePerformanceGenerator employeePerformanceGenerator = new EmployeePerformanceGenerator();
        String result = employeePerformanceGenerator.generateReport(ReportType.PDF, new Employee(59,"Eeshu Narayan" ,"eeshunarayan@gmail.com" ));
        System.out.println(result);
        
        String wordResult = employeePerformanceGenerator.generateReport(ReportType.WORD, new Employee(59,"Eeshu Narayan" ,"eeshunarayan@gmail.com" ));
        System.out.println(wordResult);
    }
}
