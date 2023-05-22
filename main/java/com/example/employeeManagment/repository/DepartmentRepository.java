package com.example.employeeManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.employeeManagment.entity.DepartmentDetails;

public interface DepartmentRepository extends JpaRepository<DepartmentDetails, Long> {

	DepartmentDetails findByDepartmentId(String departmentid);

	@Transactional
	void deleteByDepartmentId(String departmentId);

}
