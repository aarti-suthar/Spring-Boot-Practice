package com.DataMappingPractice.DataMappingPractice.controllers;

import com.DataMappingPractice.DataMappingPractice.entities.DepartmentEntity;
import com.DataMappingPractice.DataMappingPractice.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/departments")
public class DepartmentController {
    DepartmentService departmentService;

    DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/{departmentId}")
    public DepartmentEntity getDepartmentById(@PathVariable("departmentId") Long departmentId) {
        return departmentService.getDepartmentById(departmentId);
    };

    @PostMapping
    public DepartmentEntity createDepartment(@RequestBody DepartmentEntity departmentEntity) {
        return departmentService.createNewDepartment(departmentEntity);
    }
}
