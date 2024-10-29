package com.DataMappingPractice.DataMappingPractice.controllers;

import com.DataMappingPractice.DataMappingPractice.entities.EmployeeEntity;
import com.DataMappingPractice.DataMappingPractice.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    EmployeeService employeeService;

    EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable("employeeId") Long employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity){
        return employeeService.createNewEmployee(employeeEntity);
    }
}
