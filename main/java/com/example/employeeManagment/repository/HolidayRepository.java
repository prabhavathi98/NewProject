package com.example.employeeManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.employeeManagment.entity.HolidayDetails;

public interface HolidayRepository extends JpaRepository<HolidayDetails, Long> {

	HolidayDetails findByDate(long date);

	@Transactional
	void deleteByDate(long date);

}
