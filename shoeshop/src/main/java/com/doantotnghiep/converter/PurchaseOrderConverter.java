package com.doantotnghiep.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.doantotnghiep.dto.DTOOrder;
import com.doantotnghiep.entities.PurchaseOrderEntity;

@Component
public class PurchaseOrderConverter extends BaseConverter<PurchaseOrderEntity, DTOOrder>{

	@Autowired
	
	@Override
	protected PurchaseOrderEntity createEntity() {
		// TODO Auto-generated method stub
		return new PurchaseOrderEntity();
	}

	@Override
	protected DTOOrder createDTO() {
		// TODO Auto-generated method stub
		return new DTOOrder();
	}
	
	public DTOOrder toDTO(PurchaseOrderEntity entity) {
		DTOOrder dto = (DTOOrder)super.toDTO(entity);
		dto.setTotalAmount(entity.getTotalAmount());
		return dto;
	}
	
	
	public PurchaseOrderEntity toEntity(DTOOrder dto) {
		PurchaseOrderEntity entity = (PurchaseOrderEntity)super.toEntity(dto);
//		Set<PurchaseOrderDetailEntity>purchaseOrderDetailEntities = new HashSet<>();
//		Set<DTOOrderDetail>orderDetails = dto.getPurchaseOrderDetails();
//		for (DTOOrderDetail dtoOrderDetail : orderDetails) {
//			
//		}
		entity.setTotalAmount(dto.getTotalAmount());
		return entity;
	}

}
