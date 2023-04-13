package com.doantotnghiep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doantotnghiep.entities.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
	
	ProductEntity findOneById(Long id);
	ProductEntity findOneByCode(String code);
	

}
