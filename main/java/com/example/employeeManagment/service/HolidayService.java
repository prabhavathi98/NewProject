package com.example.employeeManagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.employeeManagment.entity.HolidayDetails;
import com.example.employeeManagment.repository.HolidayRepository;

public class HolidayService {
	@Autowired
	HolidayRepository holidayrepository;

	public HolidayService(HolidayRepository holidayrepository) {
		this.holidayrepository = holidayrepository;
	}

	public String addUser(HolidayDetails holidaydetail) {
		HolidayDetails holidaydet = (HolidayDetails) holidayrepository.findByDate(holidaydetail.getDate());
		if (holidaydet == null) {
			System.out.println("HELLO" + holidaydetail.getDate() + "    " + holidaydetail.getReason());
			holidayrepository.save(holidaydetail);
			return "Holiday has been added on : " + holidaydetail.getDate();
		}
		return "DATA ALREADY THERE";
	}

	public List<HolidayDetails> findAllHoliday() {
		List<HolidayDetails> holidaylist = (List<HolidayDetails>) holidayrepository.findAll();
		if (holidaylist != null) {
			return holidaylist;
		}
		return null;
	}

	public HolidayDetails findByDate(long date) {
		HolidayDetails holidaylist = (HolidayDetails) holidayrepository.findByDate(date);

		if (holidaylist != null) {
			return holidaylist;
		}
		return null;
	}

	public String deleteBydeptid(long date) {
		holidayrepository.deleteByDate(date);
		return "Deleted Successfully";
	}

}
