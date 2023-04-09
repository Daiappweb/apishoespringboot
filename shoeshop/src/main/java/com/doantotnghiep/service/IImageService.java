package com.doantotnghiep.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.doantotnghiep.dto.DTOImage;

public interface IImageService {
	DTOImage saveDTO(DTOImage dto);
}
