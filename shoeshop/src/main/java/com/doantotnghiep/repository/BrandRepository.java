package com.doantotnghiep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doantotnghiep.entities.BrandEntity;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Long>{
	BrandEntity findOneById(Long id);
	BrandEntity findOneByCode(String code);
}
