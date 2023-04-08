package com.doantotnghiep.converter;

import com.doantotnghiep.dto.DTOBase;
import com.doantotnghiep.entities.BaseEntity;

public abstract class BaseConverter <E extends BaseEntity, D extends DTOBase>{
	public E toEntity(D dto) {
		E entity = createEntity();
		entity.setCode(dto.getCode());
		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());
		entity.setCreatedDate(dto.getCreatedDate());
		entity.setUpdatedDate(dto.getUpdatedDate());
		entity.setCreatedBy(dto.getCreatedByUser());
		entity.setUpdatedBy(dto.getUpdatedByUser());
		entity.setIsDeleted(dto.getIsDeleted());
		return entity;
	}
	
	public D toDTO(E entity){
		D  dto = createDTO();
		if(entity.getId()!=null) {
			dto.setId(entity.getId());
		}
		dto.setCode(entity.getCode());
		dto.setName(entity.getName());
		dto.setDescription(entity.getDescription());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setUpdatedDate(entity.getUpdatedDate());
		dto.setCreatedByUser(entity.getCreatedBy());
		dto.setUpdatedByUser(entity.getUpdatedBy());
		dto.setIsDeleted(entity.getIsDeleted());
		return dto;
	}
	
	public E toEntity(D dto, E entity) {
		
		entity.setCode(dto.getCode());
		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());
		entity.setCreatedDate(dto.getCreatedDate());
		entity.setUpdatedDate(dto.getUpdatedDate());
		entity.setCreatedBy(dto.getCreatedByUser());
		entity.setUpdatedBy(dto.getUpdatedByUser());
		entity.setIsDeleted(dto.getIsDeleted());
		return entity;
	}
	
	protected abstract E createEntity();
	protected abstract D createDTO();
}
