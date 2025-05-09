package com.wtt.admin.adminService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


import com.wtt.admin.adminEntity.Enquiry;
import com.wtt.admin.adminRepo.*;

@Service
public class EnquiryService {
	@Autowired
	EnquiryRepo enquiryRepo;
	
	//to save an enquire
	public Enquiry saveEnquire(Enquiry enquiry) {
		
		return enquiryRepo.save(enquiry);
	}
	//to retrieve enquire
	public List<Enquiry> getEnquire() {
		return enquiryRepo.findAll();
	}
	//to delete Enquire
	public boolean deleteEnquire(Long id) {
		if(enquiryRepo.existsById(id)) {
			enquiryRepo.deleteById(id);
			return true;
		}else
			return false;
	}
}