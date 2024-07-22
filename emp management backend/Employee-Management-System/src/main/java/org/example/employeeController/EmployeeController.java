package org.example.employeeController;

import lombok.RequiredArgsConstructor;
import org.example.dto.Employee;
import org.example.service.EmployeeService;
import org.example.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/emp-controller")
@RequiredArgsConstructor
public class EmployeeController {

    final EmployeeService service;
    @PostMapping("add-employee")
    public void addEmployee(@RequestBody Employee employee){
        service.addEmployee(employee);

    }
    @GetMapping("get-all")
    public List<Employee> getAll(){
        return service.getAll();
    }
}

