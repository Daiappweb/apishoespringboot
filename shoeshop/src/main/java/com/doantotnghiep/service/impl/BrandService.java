package com.doantotnghiep.service.impl;

import java.util.ArrayList;
import java.util.List;

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
	@Override
	public List<DTOBrand> getAllBrands() {
		List<BrandEntity>brandEntities = repository.findAll();
		List<DTOBrand>dtoBrands = new ArrayList<DTOBrand>();
		for (BrandEntity entity : brandEntities) {
			dtoBrands.add(converter.toDTO(entity));
		}
		return dtoBrands;
	}
	

}
