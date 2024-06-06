package com.Emp.EmpCRUDapi.repository;

import com.Emp.EmpCRUDapi.entity.EmpEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<EmpEntity,Long> {
}
