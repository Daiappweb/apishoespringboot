package com.doantotnghiep.service;

import java.util.List;

import com.doantotnghiep.dto.DTOColor;

public interface IColorService {
	DTOColor saveDTO(DTOColor color);
	 List<DTOColor>getAllColors();
}
