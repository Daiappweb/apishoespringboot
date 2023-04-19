package com.doantotnghiep.converter;

import org.springframework.stereotype.Component;

import com.doantotnghiep.dto.DTORole;
import com.doantotnghiep.entities.RoleEntity;

@Component
public class RoleConveter extends BaseConverter<RoleEntity, DTORole>{

	@Override
	protected RoleEntity createEntity() {
		// TODO Auto-generated method stub
		return new RoleEntity();
	}

	@Override
	protected DTORole createDTO() {
		// TODO Auto-generated method stub
		return new DTORole();
	}

}
