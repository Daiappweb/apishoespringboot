package com.doantotnghiep.converter;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.doantotnghiep.dto.DTOCategory;
import com.doantotnghiep.dto.DTOColor;
import com.doantotnghiep.dto.DTOImage;
import com.doantotnghiep.dto.DTOProduct;
import com.doantotnghiep.dto.DTOSize;
import com.doantotnghiep.entities.CategoryEntity;
import com.doantotnghiep.entities.ColorEntity;
import com.doantotnghiep.entities.ImageEntity;
import com.doantotnghiep.entities.ProductEntity;
import com.doantotnghiep.entities.SizeEntity;

@Component
public class ProductConverter extends BaseConverter<ProductEntity,DTOProduct>{
	@Autowired
	private ImageConverter imageConverter;
	@Autowired
	private BrandConverter brandConverter;
	@Autowired
	private ColorConverter colorConverter;
	@Autowired
	private SizeConverter sizeConverter;
	@Autowired
	private CategoryConverter categoryConverter;
	
	public ProductEntity toEntity(DTOProduct dto) {
		
		ProductEntity entity = (ProductEntity) super.toEntity(dto);
		entity.setQuantity(dto.getQuantity());
		entity.setPrice(dto.getPrice());
		entity.setInStock(dto.getInStock());
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
		
		Set<ColorEntity>colorEntities = entity.getColors();
		Set<DTOColor>colors = new HashSet<>();
		for (ColorEntity item : colorEntities) {
			colors.add(colorConverter.toDTO(item));
		}
		
		Set<SizeEntity>sizeEntities = entity.getSizes();
		Set<DTOSize>sizes = new HashSet<>();
		for (SizeEntity item : sizeEntities) {
			sizes.add(sizeConverter.toDTO(item));
		}
		
		Set<CategoryEntity>categoryEntities = entity.getCategories();
		Set<DTOCategory>categories = new HashSet<>();
		for (CategoryEntity item : categoryEntities) {
			categories.add(categoryConverter.toDTO(item));
		}
		
		
		dto.setImages(images);
		dto.setBrand(brandConverter.toDTO(entity.getBrand()));
		dto.setColors(colors);
		dto.setSizes(sizes);
		dto.setCategories(categories);
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
