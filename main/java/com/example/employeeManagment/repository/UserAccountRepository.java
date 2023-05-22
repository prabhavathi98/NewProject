package com.example.employeeManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.employeeManagment.entity.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
	UserAccount findByEmployeeId(String employeeId);

	@Transactional
	void deleteByEmployeeId(String employeeId);

}
