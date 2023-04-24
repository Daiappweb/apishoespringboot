package com.doantotnghiep.service;

import com.doantotnghiep.dto.DTOOrderProduct;

public interface IOrderProductService {
	DTOOrderProduct saveDTO(DTOOrderProduct dto,Long productId,Long orderId);
}
