package com.doantotnghiep.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doantotnghiep.dto.DTOOrder;
import com.doantotnghiep.service.impl.PurchaseOrderService;

@CrossOrigin(origins="*")
@RestController
public class OrderAPI {
	
	@Autowired
	private PurchaseOrderService service;
	
	@PostMapping(value="/order")
	public DTOOrder saveDTO(@RequestBody DTOOrder dto) {
		return service.saveDTO(dto);
	}
}
