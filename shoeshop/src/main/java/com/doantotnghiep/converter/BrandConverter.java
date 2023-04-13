package com.doantotnghiep.converter;

import org.springframework.stereotype.Component;

import com.doantotnghiep.dto.DTOBrand;
import com.doantotnghiep.entities.BrandEntity;

@Component
public class BrandConverter extends BaseConverter<BrandEntity, DTOBrand>{

	@Override
	protected BrandEntity createEntity() {
		// TODO Auto-generated method stub
		return new BrandEntity();
	}

	@Override
	protected DTOBrand createDTO() {
		// TODO Auto-generated method stub
		return new DTOBrand();
	}

}
