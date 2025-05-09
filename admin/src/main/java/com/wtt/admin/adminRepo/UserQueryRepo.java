package com.wtt.admin.adminRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wtt.admin.adminEntity.UserQuery;
@Repository
public interface UserQueryRepo  extends JpaRepository<UserQuery, Long>{

}
