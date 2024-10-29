package com.DataMappingPractice.DataMappingPractice.repositories;

import com.DataMappingPractice.DataMappingPractice.entities.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
}
