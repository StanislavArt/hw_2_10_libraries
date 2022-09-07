package pro.sky.java.course2.libraries.service;

import pro.sky.java.course2.libraries.Employee;

import java.util.Map;

public interface EmployeeService {
    void addEmployee(String firstName, String lastName, int department, double salary);
    void removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
    Map<String, Employee> getEmployees();
}
