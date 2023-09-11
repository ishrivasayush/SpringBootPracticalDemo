package com.Narainox.SpringBootBackend.Repository;

import com.Narainox.SpringBootBackend.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
