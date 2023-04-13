package com.doantotnghiep.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doantotnghiep.converter.ImageConverter;
import com.doantotnghiep.dto.DTOImage;
import com.doantotnghiep.entities.ImageEntity;
import com.doantotnghiep.service.IImageService;

@Service
public class ImageService implements IImageService{

	@Autowired
	private ImageConverter converter;
	
	@Override
	public DTOImage saveDTO(DTOImage dto) {
		
		ImageEntity entity = converter.toEntity(dto);
//		ProductEntity product = productRepository.findOneById(dto.getProduct().getId());
//		entity.setProduct(product);
//		repository.save(entity);
		return converter.toDTO(entity);
	}

}
