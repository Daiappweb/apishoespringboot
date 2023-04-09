package com.doantotnghiep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doantotnghiep.entities.ImageEntity;

public interface ImageRepository extends JpaRepository<ImageEntity, Long>{
	
	ImageEntity findOneById(Long id);
	ImageEntity findOneByCode(String code);

}
