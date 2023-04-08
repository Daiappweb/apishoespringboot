package com.doantotnghiep.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doantotnghiep.converter.ProductConverter;
import com.doantotnghiep.dto.DTOProduct;
import com.doantotnghiep.entities.ProductEntity;
import com.doantotnghiep.repository.ProductRepository;
import com.doantotnghiep.service.IProductService;

@Service
public class ProductService implements IProductService{
	@Autowired
	private ProductRepository repository;
	@Autowired
	private ProductConverter converter;
	@Override
	public DTOProduct saveDTO(DTOProduct product) {
		ProductEntity entity = new ProductEntity();
		if(product.getId() != null) {
			ProductEntity oldEntity = repository.findOneById(product.getId());
			entity = converter.toEntity(product, oldEntity);
		}else {
			entity = converter.toEntity(product);
		}
		
		repository.save(entity);
		return converter.toDTO(entity);
	}

}
