package com.doantotnghiep.converter;

import org.springframework.stereotype.Component;

import com.doantotnghiep.dto.DTOCategory;
import com.doantotnghiep.entities.CategoryEntity;

@Component
public class CategoryConverter extends BaseConverter<CategoryEntity, DTOCategory>{

	@Override
	protected CategoryEntity createEntity() {
		// TODO Auto-generated method stub
		return new CategoryEntity();
	}

	@Override
	protected DTOCategory createDTO() {
		// TODO Auto-generated method stub
		return new DTOCategory();
	}

}
