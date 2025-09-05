package Lesson1.Example2.BetterCode;

public class EmployeeContainer {
    private EmployeeBioDataService bioDataService;
    private SalaryCalculatorService salaryService;
    private PerformanceReportService performanceService;

    public EmployeeContainer(EmployeeBioDataService bioDataService, 
                           SalaryCalculatorService salaryService,
                           PerformanceReportService performanceService) {
        this.bioDataService = bioDataService;
        this.salaryService = salaryService;
        this.performanceService = performanceService;
    }

    public String getBioData(Employee employee) {
        return bioDataService.fetchBioData(employee);
    }

    public double getSalary(Employee employee) {
        return salaryService.calculateSalary(employee);
    }

    public void getPerformanceData(Employee employee) {
        performanceService.printPerformanceData(employee);
    }
}
