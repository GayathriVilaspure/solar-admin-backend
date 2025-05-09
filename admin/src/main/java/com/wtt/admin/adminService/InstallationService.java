package com.wtt.admin.adminService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtt.admin.adminEntity.InstallationEntity;
import com.wtt.admin.adminRepo.InstallationRepo;


@Service
public class InstallationService {
	   @Autowired
	    InstallationRepo Repo;
	    
	    public InstallationEntity saveData(InstallationEntity CE) {
	        return Repo.save(CE);
	    }
	    
	    public InstallationEntity updateData(InstallationEntity CE) {
	        if (Repo.existsById(CE.getId())) {
	            return Repo.save(CE);
	        }
	        throw new RuntimeException("Consumer not found with id: " + CE.getId());
	    }
	    
	    public List<InstallationEntity> getData() {
	        return Repo.findAll();
	    }
	    
	    public InstallationEntity getById(Long id) {
	        return Repo.findById(id)
	            .orElseThrow(() -> new RuntimeException("Consumer not found with id: " + id));
	    }
	    
	    public void deleteById(Long id) {
	        if (Repo.existsById(id)) {
	            Repo.deleteById(id);
	        } else {
	            throw new RuntimeException("Consumer not found with id: " + id);
	        }
	    }
}
