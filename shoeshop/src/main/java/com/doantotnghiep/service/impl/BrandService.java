package com.doantotnghiep.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doantotnghiep.converter.BrandConverter;
import com.doantotnghiep.dto.DTOBrand;
import com.doantotnghiep.entities.BrandEntity;
import com.doantotnghiep.repository.BrandRepository;
import com.doantotnghiep.service.IBrandService;

@Service
public class BrandService implements IBrandService{

	@Autowired
	private BrandRepository repository;
	@Autowired
	private BrandConverter converter;
	@Override
	public DTOBrand saveDTO(DTOBrand dto) {
		BrandEntity entity = converter.toEntity(dto);
		repository.save(entity);
		return converter.toDTO(entity);
	}

}
