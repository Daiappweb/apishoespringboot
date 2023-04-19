package com.doantotnghiep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doantotnghiep.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	UserEntity findOneById(Long id);
	UserEntity findOneByCode(String code);
	UserEntity findOneByUserName(String userName);
	UserEntity findOneByEmail(String email);
}
