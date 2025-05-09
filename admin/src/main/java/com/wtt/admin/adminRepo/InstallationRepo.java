package com.wtt.admin.adminRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wtt.admin.adminEntity.InstallationEntity;

public interface InstallationRepo extends JpaRepository<InstallationEntity, Long> {

}
