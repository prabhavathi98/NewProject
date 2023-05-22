package com.example.employeeManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.transaction.annotation.Transactional;

import com.example.employeeManagment.entity.LeaveDetails;

public interface LeaveRepository extends JpaRepository<LeaveDetails, Long> {

	LeaveDetails[] findByEmployeeId(String employeeId);

	LeaveDetails findByEmployeeIdAndFromdate(String employeeId, String fromdate);

	LeaveDetails[] findByDeptId(String deptId);

	@Transactional
	void deleteByEmployeeId(String employeeId);
}
