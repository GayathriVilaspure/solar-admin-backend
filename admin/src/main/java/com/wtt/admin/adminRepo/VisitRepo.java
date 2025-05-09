package com.wtt.admin.adminRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wtt.admin.adminEntity.Visit;
@Repository
public interface VisitRepo  extends JpaRepository<Visit, Long>{

}
