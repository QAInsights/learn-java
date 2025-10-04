package org.qainsights.Employee;

public record EmployeeRecord(String name, int employeeID) {
    public String employeeDetailsToUpper() {
        return this.name + this.employeeID;
    }

}
