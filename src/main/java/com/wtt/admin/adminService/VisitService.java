package com.wtt.admin.adminService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtt.admin.adminEntity.Visit;
import com.wtt.admin.adminRepo.*;
@Service
public class VisitService {
@Autowired
VisitRepo VisitRepo;
public Visit savevisit(Visit visit) {
return	VisitRepo.save(visit);
}
public Optional<Visit> getvisit(Long id) {
	return VisitRepo.findById(id);
}
public List<Visit> getVisits(){
	return VisitRepo.findAll();
}
}
