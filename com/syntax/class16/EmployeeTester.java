package com.syntax.class16;

import com.syntax.class17.Employee;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Gevorg";
        // employee.salary = 1234132; we cannot access private
        // employee.department = "IT"; because we cannot access the default
        System.out.println(Employee.manager);
        Employee.printManager();
        // Static fields and methods can also ve accessed by just writing the name of the class
    }
}
