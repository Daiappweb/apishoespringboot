package com.doantotnghiep.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doantotnghiep.dto.DTOBrand;
import com.doantotnghiep.service.impl.BrandService;

@RestController
public class BrandAPI {
	@Autowired
	private BrandService service;
	
	@PostMapping(value="/brand")
	public DTOBrand saveBrand(@RequestBody DTOBrand brand) {
		return service.saveDTO(brand);
	}
}
