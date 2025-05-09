package com.wtt.admin.adminController;
import org.slf4j.LoggerFactory;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wtt.admin.adminEntity.UserQuery;
import com.wtt.admin.adminService.*;
@RestController
@RequestMapping("/query")
@CrossOrigin(origins = "*")
public class UserQuriesController {
	@Autowired
	UserQueryServ UserQueryServ;
	  private static final Logger logger = LoggerFactory.getLogger(UserQuriesController.class);

	// to save the new query
@PostMapping("/saveQuery")
public ResponseEntity<Object> saveuser(@RequestBody  UserQuery   UserQuery ) {
	//calling the service layer to use query
	long startime = System.currentTimeMillis();
	try{
		UserQuery save= UserQueryServ.saveQuery(UserQuery);
		long end = System.currentTimeMillis();
		logger.info("excution time",(end - startime));
		System.out.println("==== controller method called ====");
		

	//returning the saved query
	return ResponseEntity.status(HttpStatus.CREATED).body(save);
	}catch(Exception e) {
	return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("not saved");

}
}
@GetMapping("/getQuery")
public List<UserQuery> getUserQuery(){
	return UserQueryServ.getUserQuery();
}
}