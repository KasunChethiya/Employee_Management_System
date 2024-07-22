package org.example.service.impl;

import org.example.dto.Employee;
import org.example.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employeeList= new ArrayList();

    @Override
    public void addEmployee(Employee employee) {
       employeeList.add(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }
}
