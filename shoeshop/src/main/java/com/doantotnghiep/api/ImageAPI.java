package com.doantotnghiep.api;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.doantotnghiep.dto.DTOImage;
import com.doantotnghiep.service.impl.ImageService;

@RestController
public class ImageAPI {
	@Autowired
	private ImageService service;
	
	@PostMapping(value = "/image")
	public DTOImage saveDTO(@RequestPart DTOImage dto) throws IOException {
		return service.saveDTO(dto);
	}
}
