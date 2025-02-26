package org.example.service;

import org.example.dto.Employee;
import org.example.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    List<EmployeeEntity> getAll();

    void deleteEmployeeById(Long id);

    void updateEmployee(Employee employee);

    Employee findById(Long id);

    Employee findByFirstName(String firstName);
}
