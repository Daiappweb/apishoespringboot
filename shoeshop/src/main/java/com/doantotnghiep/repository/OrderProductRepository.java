package com.doantotnghiep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doantotnghiep.entities.OrderProductEntity;

@Repository
public interface OrderProductRepository extends JpaRepository<OrderProductEntity, Long>{
	OrderProductEntity findOneById(Long id);
}
