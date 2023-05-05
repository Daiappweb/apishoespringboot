package com.doantotnghiep.service;

import java.util.List;

import com.doantotnghiep.dto.DTOBrand;

public interface IBrandService {
	DTOBrand saveDTO(DTOBrand dto);
	List<DTOBrand>getAllBrands();
}
