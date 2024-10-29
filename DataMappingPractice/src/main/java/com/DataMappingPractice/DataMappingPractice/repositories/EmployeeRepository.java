package com.DataMappingPractice.DataMappingPractice.repositories;

import com.DataMappingPractice.DataMappingPractice.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
