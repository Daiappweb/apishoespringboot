package com.doantotnghiep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doantotnghiep.entities.ColorEntity;

public interface ColorRepository extends JpaRepository<ColorEntity, Long>{
	ColorEntity findOneById(Long id);
	ColorEntity findOneByCode(String color);

}
