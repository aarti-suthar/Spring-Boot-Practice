package com.DataMappingPractice.DataMappingPractice.services;

import com.DataMappingPractice.DataMappingPractice.entities.DepartmentEntity;
import com.DataMappingPractice.DataMappingPractice.repositories.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public DepartmentEntity getDepartmentById(Long departmentId){
        return departmentRepository.findById(departmentId).orElse(null);
    }

    public DepartmentEntity createNewDepartment(DepartmentEntity departmentEntity){
        return departmentRepository.save(departmentEntity);
    }


}
