package org.qainsights.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class Main {
    static void main() {
        EmployeeRecord employeeRecord = new EmployeeRecord("NaveenKumar", 1);
        System.out.println(employeeRecord.name() + " " + employeeRecord.employeeID());
        System.out.println(employeeRecord.employeeDetailsToUpper());
    }
}
