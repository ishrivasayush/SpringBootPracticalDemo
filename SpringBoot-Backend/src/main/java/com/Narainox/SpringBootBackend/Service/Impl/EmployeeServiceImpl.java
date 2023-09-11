package com.Narainox.SpringBootBackend.Service.Impl;

import com.Narainox.SpringBootBackend.Exception.ResourceNotFoundException;
import com.Narainox.SpringBootBackend.Model.Employee;
import com.Narainox.SpringBootBackend.Repository.EmployeeRepository;
import com.Narainox.SpringBootBackend.Service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(long id) {
        Optional<Employee> employee=employeeRepository.findById(id);
        if(employee.isPresent())
        {
            return employee.get();
        }
        else {
            throw new ResourceNotFoundException("Employee","id",id);
        }
    }

    public String deleteEmployee(long id) {
        Optional<Employee> employee=employeeRepository.findById(id);
        if(employee.isPresent())
        {
            Employee employee1= employee.get();
            employeeRepository.delete(employee1);
            return "Employee is SuccessFully Deleted.";
        }
        else {
            throw new ResourceNotFoundException("Employee","id",id);
        }
    }
}
