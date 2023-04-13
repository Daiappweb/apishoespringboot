package com.doantotnghiep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doantotnghiep.entities.SizeEntity;

@Repository
public interface SizeRepository extends JpaRepository<SizeEntity, Long>{
	SizeEntity findOneById(Long id);
	SizeEntity findOneByCode(String code);
}
