package com.doantotnghiep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doantotnghiep.entities.PurchaseOrderEntity;

@Repository
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrderEntity, Long>{
	PurchaseOrderEntity findOneById(Long id);
}
