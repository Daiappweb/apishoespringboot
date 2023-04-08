package com.doantotnghiep.converter;

import org.springframework.stereotype.Component;

import com.doantotnghiep.dto.DTOProduct;
import com.doantotnghiep.entities.ProductEntity;

@Component
public class ProductConverter extends BaseConverter<ProductEntity,DTOProduct>{
	public ProductEntity toEntity(DTOProduct dto) {
		
		ProductEntity entity = (ProductEntity) super.toEntity(dto);
		entity.setQuantity(dto.getQuantity());
		entity.setPrice(dto.getPrice());
		entity.setInStock(dto.getInStock());
		
		return entity;
	}
	
	public DTOProduct toDTO(ProductEntity entity) {
		DTOProduct dto = (DTOProduct) super.toDTO(entity);
		
		dto.setQuantity(entity.getQuantity());
		dto.setPrice(entity.getPrice());
		dto.setInStock(entity.getInStock());
		return dto;
	}

	@Override
	protected ProductEntity createEntity() {
		// TODO Auto-generated method stub
		return new ProductEntity();
	}

	@Override
	protected DTOProduct createDTO() {
		// TODO Auto-generated method stub
		return new DTOProduct();
	}
}
