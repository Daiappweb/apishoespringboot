package com.doantotnghiep.converter;

import org.springframework.stereotype.Component;

import com.doantotnghiep.dto.DTOColor;
import com.doantotnghiep.entities.ColorEntity;

@Component
public class ColorConverter extends BaseConverter<ColorEntity, DTOColor>{

	@Override
	protected ColorEntity createEntity() {
		// TODO Auto-generated method stub
		return new ColorEntity();
	}

	@Override
	protected DTOColor createDTO() {
		// TODO Auto-generated method stub
		return new DTOColor();
	}
	
}
