package com.Narainox.SpringBootBackend.Service;

import com.Narainox.SpringBootBackend.Model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();

    Employee getEmployee(long id);
    String deleteEmployee(long id);
}
