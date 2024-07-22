package org.example.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.dto.Employee;
import org.example.entity.EmployeeEntity;
import org.example.repository.EmployeeRepository;
import org.example.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {



    final EmployeeRepository repository;

    @Override
    public void addEmployee(Employee employee) {

        EmployeeEntity employeeEntity = new ObjectMapper().convertValue(employee, EmployeeEntity.class);
        repository.save(employeeEntity);
    }

    @Override
    public List<EmployeeEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public void deleteEmployeeById(Long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
        }
    }

    @Override
    public void updateEmployee(Employee employee) {
        if(repository.findById(employee.getId()).isPresent()){
            repository.save(new ObjectMapper().convertValue(employee, EmployeeEntity.class));

        }
    }
}
