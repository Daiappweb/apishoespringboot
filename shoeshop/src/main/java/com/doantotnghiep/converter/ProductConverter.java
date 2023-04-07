package com.doantotnghiep.converter;

import org.springframework.stereotype.Component;

import com.doantotnghiep.dto.DTOProduct;
import com.doantotnghiep.entities.ProductEntity;

@Component
public class ProductConverter {
	public ProductEntity toEntity(DTOProduct product) {
		ProductEntity entity = new ProductEntity();
		
		return entity;
	}
}
