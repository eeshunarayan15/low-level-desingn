package Lesson1.Example2.ProblamaticCode;

public class Employee {
    private int id;

    public int getId() {
        return this.id;
    }

    // SRP Violation: Multiple responsibilities in one class
    public String fetchBioData() {
        return "Some bio data";
    }

    public double calculateSalary() {
        return 0;
    }

    public void printPerformanceData() {
        System.out.println("some performance related data");
    }
}