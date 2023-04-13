package com.doantotnghiep.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doantotnghiep.dto.DTOSize;
import com.doantotnghiep.service.impl.SizeService;

@RestController
public class SizeAPI {
	@Autowired 
	private SizeService service;
	
	@PostMapping(value="/size")
	public DTOSize saveDTO(@RequestBody DTOSize size) {
		return service.saveDTO(size);
	}
}
