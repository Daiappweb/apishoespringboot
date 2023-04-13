package com.doantotnghiep.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doantotnghiep.converter.ColorConverter;
import com.doantotnghiep.dto.DTOColor;
import com.doantotnghiep.entities.ColorEntity;
import com.doantotnghiep.repository.ColorRepository;
import com.doantotnghiep.service.IColorService;

@Service
public class ColorService implements IColorService{

	@Autowired
	private ColorRepository repository;
	@Autowired 
	private ColorConverter converter;
	@Override
	public DTOColor saveDTO(DTOColor color) {
		ColorEntity entity = converter.toEntity(color);
		repository.save(entity);
		return converter.toDTO(entity);
	}
	
}
