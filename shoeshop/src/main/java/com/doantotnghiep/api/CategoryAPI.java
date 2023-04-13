package com.doantotnghiep.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doantotnghiep.dto.DTOCategory;
import com.doantotnghiep.service.impl.CategoryService;

@RestController
public class CategoryAPI {
	@Autowired
	private CategoryService service;
	
	@PostMapping
	public DTOCategory saveDTO(@RequestBody DTOCategory category) {
		return service.saveDTO(category);
	}
}
