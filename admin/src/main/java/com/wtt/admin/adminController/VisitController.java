package com.wtt.admin.adminController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wtt.admin.adminEntity.Visit;
import com.wtt.admin.adminService.*;
@RestController
@RequestMapping("/visit")
@CrossOrigin(origins = "*")
public class VisitController {
@Autowired
VisitService VisitService;
@PostMapping("/visitors")
public Visit savevisit(@RequestBody Visit visit) {
	return VisitService.savevisit(visit);
}
@GetMapping("/visitors/{id}")
public Optional<Visit> getVisit(@PathVariable Long id) {
	return VisitService.getvisit(id);
}
@GetMapping("/visitors/get")
public List<Visit> getVisits() {
	return VisitService.getVisits();
}
}
