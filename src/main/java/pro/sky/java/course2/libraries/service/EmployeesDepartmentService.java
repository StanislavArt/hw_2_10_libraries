package pro.sky.java.course2.libraries.service;

import pro.sky.java.course2.libraries.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeesDepartmentService {
    Employee getEmployeeMaxSalaryByDepartment(EmployeeService employeeService, int department);
    Employee getEmployeeMinSalaryByDepartment(EmployeeService employeeService, int department);
    List<Employee> getEmployeesByDepartment(EmployeeService employeeService, int department);
    Map<Integer, List<Employee>> getEmployeesByDepartmentGrouping(EmployeeService employeeService);
}
