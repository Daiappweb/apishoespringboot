package com.doantotnghiep.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doantotnghiep.converter.RoleConveter;
import com.doantotnghiep.dto.DTORole;
import com.doantotnghiep.entities.RoleEntity;
import com.doantotnghiep.repository.RoleRepository;
import com.doantotnghiep.service.IRoleService;
@Service
public class RoleService implements IRoleService{

	@Autowired
	private RoleConveter converter;
	@Autowired
	private RoleRepository repository;
	@Override
	public DTORole saveDTO(DTORole dto) {
		RoleEntity entity  = converter.toEntity(dto);
		repository.save(entity);
		return converter.toDTO(entity);
	}
	
}
