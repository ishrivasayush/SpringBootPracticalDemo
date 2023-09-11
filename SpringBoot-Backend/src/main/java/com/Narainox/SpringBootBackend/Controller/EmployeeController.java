package com.Narainox.SpringBootBackend.Controller;

import com.Narainox.SpringBootBackend.Model.Employee;
import com.Narainox.SpringBootBackend.Service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //Build create Employee REST API:
    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
    {
        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    // Build  get all Employee Rest API
    @GetMapping()
    public ResponseEntity<List<Employee>> getAllEmployee()
    {
        return new ResponseEntity<>(employeeService.getAllEmployee(),HttpStatus.ACCEPTED);
    }

    // Build  get One Employee By Id Rest API
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable long id)
    {
        return new ResponseEntity<Employee>(employeeService.getEmployee(id),HttpStatus.OK);
    }

    // Build  get One Employee By Id Rest API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable long id)
    {
        return new ResponseEntity<String>(employeeService.deleteEmployee(id),HttpStatus.OK);
    }
}
