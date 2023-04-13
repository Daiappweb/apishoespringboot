package com.doantotnghiep.converter;

import org.springframework.stereotype.Component;

import com.doantotnghiep.dto.DTOSize;
import com.doantotnghiep.entities.SizeEntity;

@Component
public class SizeConverter extends BaseConverter<SizeEntity, DTOSize>{

	@Override
	protected SizeEntity createEntity() {
		// TODO Auto-generated method stub
		return new SizeEntity();
	}

	@Override
	protected DTOSize createDTO() {
		// TODO Auto-generated method stub
		return new DTOSize();
	}

}
