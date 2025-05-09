package com.wtt.admin.adminService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtt.admin.adminEntity.UserQuery;
import com.wtt.admin.adminRepo.*;
@Service
public class UserQueryServ {
@Autowired
UserQueryRepo UserQueryRepo ;
//method to save user query into database
public UserQuery saveQuery(UserQuery uq) {
	try {
		//calling inbuilt repository method to save query
	return UserQueryRepo.save(uq);
}catch(Exception e) {
	//if something goes wrong,throw a new run time exception with message
	throw new RuntimeException("Failed to save user"+e.getMessage());
}
} public List<UserQuery> getUserQuery(){
	return UserQueryRepo.findAll();
}
}