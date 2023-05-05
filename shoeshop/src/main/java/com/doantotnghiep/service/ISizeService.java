package com.doantotnghiep.service;

import java.util.List;

import com.doantotnghiep.dto.DTOSize;

public interface ISizeService {
	DTOSize saveDTO(DTOSize size);
	List<DTOSize>getAllSizes();
}
