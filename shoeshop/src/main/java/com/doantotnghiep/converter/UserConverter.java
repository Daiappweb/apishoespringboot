package com.doantotnghiep.converter;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.doantotnghiep.dto.DTORole;
import com.doantotnghiep.dto.DTOUser;
import com.doantotnghiep.entities.RoleEntity;
import com.doantotnghiep.entities.UserEntity;

@Component
public class UserConverter extends BaseConverter<UserEntity, DTOUser>{
	@Autowired
	private RoleConveter roleConveter;
	
	@Override
	protected UserEntity createEntity() {
		// TODO Auto-generated method stub
		return new UserEntity();
	}

	@Override
	protected DTOUser createDTO() {
		// TODO Auto-generated method stub
		return new DTOUser();
	}
	
	public DTOUser toDTO(UserEntity entity) {
		DTOUser dto = (DTOUser)super.toDTO(entity);
		dto.setId(entity.getId());
		dto.setAddress(entity.getAddress());
		dto.setEmail(entity.getEmail());
		dto.setUserName(entity.getUserName());
		dto.setPassword(entity.getPassword());
		
		
		//add role
		Set<RoleEntity>roleEntities = entity.getRoles();
		Set<DTORole>roles = new HashSet<>();
		for (RoleEntity roleEntity : roleEntities) {
			roles.add(roleConveter.toDTO(roleEntity));
		}
		dto.setRoles(roles);
		
		return dto;
	}
	
	public UserEntity toEntity(DTOUser dto) {
		UserEntity entity  = (UserEntity)super.toEntity(dto);
		entity.setAddress(dto.getAddress());
		entity.setEmail(dto.getEmail());
		entity.setUserName(dto.getUserName());
		entity.setPassword(dto.getPassword());
		
	
		return entity;
	}

}
