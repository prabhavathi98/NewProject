package com.example.employeeManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.transaction.annotation.Transactional;

import com.example.employeeManagment.entity.EmployeeDetails;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Long> {

	EmployeeDetails findByEmployeeId(String employeeid);

	EmployeeDetails findByEmployeeIdAndShift(String employeeid, String shift);

	EmployeeDetails[] findByDepartment(String department);

	@Transactional
	void deleteByEmployeeId(String employeeId);
}
