package com.doantotnghiep.service;

import java.io.IOException;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import com.doantotnghiep.dto.DTOProduct;

public interface IProductService {
	DTOProduct saveDTO(DTOProduct product,MultipartFile[]files,String brand,String color,
			String category,String size) throws IOException;
	List<DTOProduct>findAll(Pageable pageable);
	int totalItem();
	List<DTOProduct>findAll();
	DTOProduct findById(Long id);
}
