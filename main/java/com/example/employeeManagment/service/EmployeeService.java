package com.example.employeeManagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeManagment.entity.EmployeeDetails;
import com.example.employeeManagment.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeerepository;

	public String addUser(EmployeeDetails employeedetail) {
		System.out.println("PLSS1" + employeedetail.getShift());

		EmployeeDetails empdetail = (EmployeeDetails) employeerepository
				.findByEmployeeId(employeedetail.getEmployeeId());
		if (empdetail == null) {
			System.out.println("PLSS" + employeedetail.getShift());
			employeerepository.save(employeedetail);
			return "User account has been added";
		}
		return null;
	}

	public List<EmployeeDetails> findAllUser() {
		List<EmployeeDetails> employeeList = (List<EmployeeDetails>) employeerepository.findAll();

		if (employeeList != null) {
			return employeeList;
		}
		return null;
	}

	public String findByempdept(String employeeid) {
		EmployeeDetails employee = (EmployeeDetails) employeerepository.findByEmployeeId(employeeid);

		if (employee != null) {
			return employee.getDepartment();
		}

		return null;
	}

	public EmployeeDetails[] findBydeptemp(String department) {
		EmployeeDetails[] employee = (EmployeeDetails[]) employeerepository.findByDepartment(department);

		if (employee != null) {
			return employee;
		}

		return null;
	}

	public EmployeeDetails findByempid(String employeeid, String shift) {
		EmployeeDetails employee = (EmployeeDetails) employeerepository.findByEmployeeIdAndShift(employeeid, shift);

		if (employee != null) {
			return employee;
		}

		return null;
	}

	public String deleteByEmpid(String employeeid) {
		employeerepository.deleteByEmployeeId(employeeid);
		return "User data has been deleted successfully.";

	}
}
