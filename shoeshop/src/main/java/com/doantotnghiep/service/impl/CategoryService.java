package com.doantotnghiep.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doantotnghiep.converter.CategoryConverter;
import com.doantotnghiep.dto.DTOCategory;
import com.doantotnghiep.entities.CategoryEntity;
import com.doantotnghiep.repository.CategoryRepository;
import com.doantotnghiep.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService{

	@Autowired
	private CategoryRepository repository;
	@Autowired
	private CategoryConverter converter;
	@Override
	public DTOCategory saveDTO(DTOCategory category) {
		CategoryEntity entity = converter.toEntity(category);
		repository.save(entity);
		return converter.toDTO(entity);
	}

}
