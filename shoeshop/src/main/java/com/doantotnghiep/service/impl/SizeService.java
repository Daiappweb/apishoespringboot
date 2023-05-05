package com.doantotnghiep.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doantotnghiep.converter.SizeConverter;
import com.doantotnghiep.dto.DTOSize;
import com.doantotnghiep.entities.SizeEntity;
import com.doantotnghiep.repository.SizeRepository;
import com.doantotnghiep.service.ISizeService;

@Service
public class SizeService implements ISizeService{

	@Autowired
	private SizeRepository repository;
	@Autowired
	private SizeConverter converter;
	@Override
	public DTOSize saveDTO(DTOSize size) {
		SizeEntity entity = converter.toEntity(size);
		repository.save(entity);
		return converter.toDTO(entity);
	}
	@Override
	public List<DTOSize> getAllSizes() {
		List<SizeEntity>sizeEntities = repository.findAll();
		List<DTOSize>dtoSizes = new ArrayList<DTOSize>();
		for (SizeEntity entity : sizeEntities) {
			dtoSizes.add(converter.toDTO(entity));
		}
		return dtoSizes;
	}

}
