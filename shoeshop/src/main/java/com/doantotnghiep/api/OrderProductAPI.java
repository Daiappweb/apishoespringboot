package com.doantotnghiep.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.doantotnghiep.dto.DTOOrderProduct;
import com.doantotnghiep.service.impl.OrderProductService;

@CrossOrigin(origins="*")
@RestController
public class OrderProductAPI {
	
	@Autowired
	private OrderProductService service;
	
	@PostMapping(value="/orderproduct")
	public DTOOrderProduct saveDTO(@RequestBody DTOOrderProduct orderProduct,@RequestParam Long productId,@RequestParam Long orderId) {
		return service.saveDTO(orderProduct,productId,orderId);
	}

}
