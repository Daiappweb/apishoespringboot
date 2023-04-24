package com.doantotnghiep.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doantotnghiep.converter.PurchaseOrderConverter;
import com.doantotnghiep.dto.DTOOrder;
import com.doantotnghiep.entities.PurchaseOrderEntity;
import com.doantotnghiep.repository.PurchaseOrderRepository;
import com.doantotnghiep.service.IPurchaseOrderService;

@Service
public class PurchaseOrderService implements IPurchaseOrderService{

	@Autowired
	private PurchaseOrderRepository repository;
	@Autowired
	private PurchaseOrderConverter converter;
	@Override
	public DTOOrder saveDTO(DTOOrder dto) {
		PurchaseOrderEntity entity = converter.toEntity(dto);
		repository.save(entity);
		return converter.toDTO(entity);
	}

}
