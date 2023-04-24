package com.doantotnghiep.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.doantotnghiep.dto.DTOOrder;
import com.doantotnghiep.dto.DTOOrderProduct;
import com.doantotnghiep.dto.DTOProduct;
import com.doantotnghiep.entities.OrderProductEntity;
import com.doantotnghiep.entities.ProductEntity;
import com.doantotnghiep.entities.PurchaseOrderEntity;

@Component
public class OrderProductConverter extends BaseConverter<OrderProductEntity, DTOOrderProduct>{

	@Autowired
	private ProductConverter productConverter;
	@Autowired
	private PurchaseOrderConverter orderConverter;
	@Override
	protected OrderProductEntity createEntity() {
		// TODO Auto-generated method stub
		return new OrderProductEntity();
	}

	@Override
	protected DTOOrderProduct createDTO() {
		// TODO Auto-generated method stub
		return new DTOOrderProduct();
	}
	
	public OrderProductEntity toEntity(DTOOrderProduct dto) {
		OrderProductEntity  orderProductEntity = (OrderProductEntity)super.toEntity(dto);
		orderProductEntity.setQuantity(dto.getQuantity());
		orderProductEntity.setPrice(dto.getPrice());
		orderProductEntity.setTotalItem(dto.getTotalItem());
		
		DTOOrder order = dto.getOrder();
		DTOProduct product = dto.getProduct();
		if(order!=null) {
			orderProductEntity.setProduct(productConverter.toEntity(product));
		}
		if(product!=null) {
			orderProductEntity.setPurchaseOrderEntity(orderConverter.toEntity(order));
		}
		
		return orderProductEntity;
	}

	public DTOOrderProduct toDTO(OrderProductEntity entity) {
		DTOOrderProduct  orderProduct = (DTOOrderProduct)super.toDTO(entity);
		orderProduct.setQuantity(entity.getQuantity());
		orderProduct.setPrice(entity.getPrice());
		orderProduct.setTotalItem(entity.getTotalItem());
		
		PurchaseOrderEntity order = entity.getPurchaseOrderEntity();
		ProductEntity product = entity.getProduct();
		
		if(order!=null) {
			orderProduct.setOrder(orderConverter.toDTO(order));
		}
		if(product!=null) {
			orderProduct.setProduct(productConverter.toDTO(product));
		}
		
		return orderProduct;
	}

}
