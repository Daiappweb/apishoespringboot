package com.doantotnghiep.service;

import java.util.List;

import com.doantotnghiep.dto.DTOCategory;

public interface ICategoryService {
	DTOCategory saveDTO(DTOCategory dto);
	 List<DTOCategory>getAllCategories();
}
