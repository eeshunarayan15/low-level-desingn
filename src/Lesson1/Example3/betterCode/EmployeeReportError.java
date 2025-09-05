package Lesson1.Example3.betterCode;

public class EmployeeReportError {
    String type;
    String  name;
    String  reportType;

    public EmployeeReportError() {
    }

    public EmployeeReportError(String type, String name, String reportType) {
        this.type = type;
        this.name = name;
        this.reportType = reportType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }
}
