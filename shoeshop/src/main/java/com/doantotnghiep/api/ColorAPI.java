package com.doantotnghiep.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doantotnghiep.dto.DTOColor;
import com.doantotnghiep.service.impl.ColorService;

@RestController
public class ColorAPI {
	@Autowired
	private ColorService service;
	
	@PostMapping(value="/color")
	public DTOColor saveColor(@RequestBody DTOColor color) {
		return service.saveDTO(color);
	}
}
