package Lesson1.Example2.BetterCode;

public class EmployeeBioDataService {
    
    public String fetchBioData(Employee employee) {
        return "Bio data for employee: " + employee.getName() + " (ID: " + employee.getId() + ")";
    }
}