package com.doantotnghiep.converter;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.doantotnghiep.dto.DTOImage;
import com.doantotnghiep.dto.DTOProduct;
import com.doantotnghiep.entities.ImageEntity;
import com.doantotnghiep.entities.ProductEntity;

@Component
public class ProductConverter extends BaseConverter<ProductEntity,DTOProduct>{
	@Autowired
	private ImageConverter imageConverter;
	public ProductEntity toEntity(DTOProduct dto) {
		
		ProductEntity entity = (ProductEntity) super.toEntity(dto);
		entity.setQuantity(dto.getQuantity());
		entity.setPrice(dto.getPrice());
		entity.setInStock(dto.getInStock());
		
//		Set<DTOImage> images = dto.getImages();
//		
//		Set<ImageEntity>imageEntites = new HashSet<>();
//		for (DTOImage dtoImage : images) {
//			imageEntites.add(imageConverter.toEntity(dtoImage));
//		}
//		entity.setImages(imageEntites);
		
		return entity;
	}
	
	public DTOProduct toDTO(ProductEntity entity) {
		DTOProduct dto = (DTOProduct) super.toDTO(entity);
		
		
		dto.setQuantity(entity.getQuantity());
		dto.setPrice(entity.getPrice());
		dto.setInStock(entity.getInStock());
		
		Set<ImageEntity> imageEntites = entity.getImages();
		
		Set<DTOImage>images = new HashSet<>();
		for (ImageEntity image : imageEntites) {
			images.add(imageConverter.toDTO(image));
		}
		
		dto.setImages(images);
		
		return dto;
	}

	@Override
	protected ProductEntity createEntity() {
		// TODO Auto-generated method stub
		return new ProductEntity();
	}

	@Override
	protected DTOProduct createDTO() {
		// TODO Auto-generated method stub
		return new DTOProduct();
	}
}
