package com.doantotnghiep.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.doantotnghiep.converter.ProductConverter;
import com.doantotnghiep.dto.DTOProduct;
import com.doantotnghiep.repository.ProductRepository;
import com.doantotnghiep.service.IProductService;

public class ProductService implements IProductService{
	@Autowired
	private ProductRepository repository;
	@Autowired
	private ProductConverter converter;
	@Override
	public DTOProduct saveDTO(DTOProduct product) {
		return null;
	}

}
