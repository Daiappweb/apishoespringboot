package com.doantotnghiep.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doantotnghiep.dto.DTOProduct;
import com.doantotnghiep.service.impl.ProductService;

@CrossOrigin
@RestController
public class ProductAPI {
	@Autowired
	private ProductService service;
	
	@PostMapping(value="/product")
	public DTOProduct createProduct(@RequestBody DTOProduct product) {
		return service.saveDTO(product);
	}
	
	@PutMapping(value = "/product/{id}")
	public DTOProduct updateProduct(@RequestBody DTOProduct dto, @PathVariable("id") long id) {
		dto.setId(id);
		return service.saveDTO(dto);
	}
}
