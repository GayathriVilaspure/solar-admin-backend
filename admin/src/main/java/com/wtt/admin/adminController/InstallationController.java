package com.wtt.admin.adminController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wtt.admin.adminEntity.InstallationEntity;
import com.wtt.admin.adminService.InstallationService;


@RestController
@RequestMapping("api/consumer")
@CrossOrigin(origins = "*")
public class InstallationController {
	 @Autowired
	    InstallationService service;
	    
	    @PostMapping("/saveData")
	    public InstallationEntity saveData(@RequestBody InstallationEntity C) {
	        return service.saveData(C);
	    }
	    
	    @PutMapping("/{id}")
	    public ResponseEntity<?> updateConsumer(@PathVariable Long id, @RequestBody InstallationEntity consumer) {
	        try {
	            consumer.setId(id);
	            return ResponseEntity.ok(service.updateData(consumer));
	        } catch (RuntimeException e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
	        }
	    }
	    
	    @GetMapping()
	    public List<InstallationEntity> getData() {
	        return service.getData();
	    }
	    
	    @GetMapping("/{id}")
	    public ResponseEntity<?> getConsumerById(@PathVariable Long id) {
	        try {
	            return ResponseEntity.ok(service.getById(id));
	        } catch (RuntimeException e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
	        }
	    }
	    
	    @DeleteMapping("/{id}")
	    public ResponseEntity<?> deleteConsumer(@PathVariable Long id) {
	        try {
	            service.deleteById(id);
	            return ResponseEntity.ok().build();
	        } catch (RuntimeException e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
	        }
	    }
	    
	    @GetMapping("/test")
	    public String test() {
	        return "testing api";
	    }
}
