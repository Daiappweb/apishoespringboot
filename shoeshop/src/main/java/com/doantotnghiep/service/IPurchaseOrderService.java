package com.doantotnghiep.service;

import java.util.List;

import com.doantotnghiep.dto.DTOOrder;

public interface IPurchaseOrderService {
	DTOOrder saveDTO(DTOOrder dto);
	List<DTOOrder>getAllOrders();
}
