package org.qainsights.employee;

public record EmployeeRecord(String name, int employeeID) {
    public String employeeDetailsToUpper() {
        return this.name + this.employeeID;
    }

}
