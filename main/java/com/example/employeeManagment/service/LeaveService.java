package com.example.employeeManagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeManagment.entity.LeaveDetails;
import com.example.employeeManagment.repository.LeaveRepository;

@Service
public class LeaveService {
	@Autowired
	private LeaveRepository LeaveRepository;

	public LeaveService(LeaveRepository leaveRepository) {
		this.LeaveRepository = leaveRepository;
	}

	public String addLeave(LeaveDetails leavedet) {

		LeaveRepository.save(leavedet);
		return "Leave has been added, user name = " + leavedet.getEmployeeId();

	}

	public List<LeaveDetails> findAllUser() {
		List<LeaveDetails> leaveList = (List<LeaveDetails>) LeaveRepository.findAll();
		if (leaveList != null) {
			return leaveList;
		}
		return null;
	}

	public String updateLeave(String employeeId, String fromdate, String leavetype) {

		LeaveDetails l = LeaveRepository.findByEmployeeIdAndFromdate(employeeId, fromdate);
		if (l != null) {
			l.setLeavetype(leavetype);
			LeaveRepository.save(l);

		}
		return "Leave has been added, user name = " + l.getEmployeeId();

	}

	public LeaveDetails[] findByEmployeeId(String employeeId) {
		LeaveDetails[] leaveList = LeaveRepository.findByEmployeeId(employeeId);
		if (leaveList != null) {
			return leaveList;
		}
		return null;
	}

	public LeaveDetails[] findByDepartmentId(String deptid) {
		// System.out.println("HELLO"+deptid);
		LeaveDetails[] leaveList = LeaveRepository.findByDeptId(deptid);
		if (leaveList != null) {
			return leaveList;
		}
		return null;
	}

	public String deleteByEmpid(String employeeid) {
		LeaveRepository.deleteByEmployeeId(employeeid);
		return "Leave data has been deleted successfully.";

	}
}
