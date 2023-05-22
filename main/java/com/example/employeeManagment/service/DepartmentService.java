package com.example.employeeManagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.employeeManagment.entity.DepartmentDetails;
import com.example.employeeManagment.repository.DepartmentRepository;

public class DepartmentService {
	@Autowired
	DepartmentRepository departmentrepository;

	public String adddepartment(DepartmentDetails departmentdetail) {
		System.out.println("HELLO" + departmentdetail.getDepartmentId());
		DepartmentDetails deptdetail = departmentrepository.findByDepartmentId(departmentdetail.getDepartmentId());
		if (deptdetail == null) {
			// System.out.println("VENAM"+deptdetail.getDepartmentId()+departmentdetail.getDepartmentName()+departmentdetail.getNoOfEmployee()+departmentdetail.getManagerId());
			departmentrepository.save(departmentdetail);
			return "Details Have been successfully added.";
		}
		return null;
	}

	public List<DepartmentDetails> findalldepartment() {
		List<DepartmentDetails> departmentList = (List<DepartmentDetails>) departmentrepository.findAll();

		if (departmentList != null) {
			return departmentList;
		}

		return null;
	}
}
