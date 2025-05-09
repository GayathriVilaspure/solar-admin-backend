package com.wtt.admin.adminRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wtt.admin.adminEntity.Enquiry;

@Repository
public interface EnquiryRepo extends JpaRepository<Enquiry, Long> {

}
