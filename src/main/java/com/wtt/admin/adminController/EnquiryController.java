package com.wtt.admin.adminController;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wtt.admin.adminService.*;
import com.wtt.admin.adminEntity.Enquiry;

@RestController
@RequestMapping("/Enquire")

public class EnquiryController {
	@Autowired
	EnquiryService EnquiryService;
   //to save Enquire
	@PostMapping("/save")
	public Enquiry saveEnquire(@RequestBody Enquiry Enquiry) {
		return  EnquiryService.saveEnquire(Enquiry);
	}
	// to delete Enquire
	@DeleteMapping("/id/{id}")
	public void deleteEnquire(@PathVariable Long id) {
	 EnquiryService.deleteEnquire(id);
	 System.out.println("deleted succesfully");
	}
	//to  get Enquire
	@GetMapping()
	public List<Enquiry> getEnquire() {
		return EnquiryService.getEnquire();
	}
}
