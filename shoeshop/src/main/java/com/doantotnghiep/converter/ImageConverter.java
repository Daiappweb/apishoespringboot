package com.doantotnghiep.converter;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.doantotnghiep.dto.DTOImage;
import com.doantotnghiep.entities.ImageEntity;


@Component
public class ImageConverter extends BaseConverter<ImageEntity,DTOImage>{
	@Autowired
	private ProductConverter productConverter;
	@Override
	protected ImageEntity createEntity() {
		return new ImageEntity();
	}

	@Override
	protected DTOImage createDTO() {
		return new DTOImage();
	}
	
	public DTOImage toDTO(ImageEntity entity) {
		DTOImage dto = (DTOImage)super.toDTO(entity);
		if(entity.getId()!=null) {
			dto.setId(entity.getId());
		}
//		dto.setProduct(productConverter.toDTO(entity.getProduct()));
		dto.setType(entity.getType());
		dto.setData(entity.getData());
		
		return dto;
	}
	
	public ImageEntity toEntity(DTOImage dto) {
		ImageEntity entity = (ImageEntity)super.toEntity(dto);
		
//		entity.setProduct(productConverter.toEntity(dto.getProduct()));
		entity.setType(dto.getType());
		entity.setData(dto.getData());


		return entity;
	}
	
	public String toBase64(byte[] data) {
		 String imageType = "jpeg";
		    if (data[0] == (byte) 0x89 && data[1] == 'P' && data[2] == 'N' && data[3] == 'G') {
		        imageType = "png";
		    }
		String base64 = Base64.getEncoder().encodeToString(data);
		String imageUrl = "data:image/"+imageType+";base64," + base64;
		return imageUrl;
	}

}
