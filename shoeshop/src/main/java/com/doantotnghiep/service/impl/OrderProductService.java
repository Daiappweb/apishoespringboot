package com.doantotnghiep.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doantotnghiep.converter.OrderProductConverter;
import com.doantotnghiep.converter.ProductConverter;
import com.doantotnghiep.converter.PurchaseOrderConverter;
import com.doantotnghiep.dto.DTOOrder;
import com.doantotnghiep.dto.DTOOrderProduct;
import com.doantotnghiep.dto.DTOProduct;
import com.doantotnghiep.entities.OrderProductEntity;
import com.doantotnghiep.repository.OrderProductRepository;
import com.doantotnghiep.repository.ProductRepository;
import com.doantotnghiep.repository.PurchaseOrderRepository;
import com.doantotnghiep.service.IOrderProductService;

@Service
public class OrderProductService implements IOrderProductService{

	@Autowired
	private OrderProductConverter converter;
	@Autowired
	private OrderProductRepository repository;
	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ProductConverter productConverter;
	
	@Autowired
	private PurchaseOrderRepository purchaseOrderRepository;
	
	@Autowired
	private PurchaseOrderConverter purchaseOrderConverter;
	@Override
	public DTOOrderProduct saveDTO(DTOOrderProduct dto,Long productId,Long orderId) {
		
		DTOProduct product = productConverter.toDTO(productRepository.findOneById(productId));
		DTOOrder order = purchaseOrderConverter.toDTO(purchaseOrderRepository.findOneById(orderId));
		dto.setProduct(product);
		dto.setOrder(order);
		OrderProductEntity entity = converter.toEntity(dto);
		entity.setProduct(productRepository.getOne(productId)); // Chuyển đối tượng liên kết thành đối tượng gốc
	    entity.setPurchaseOrderEntity(purchaseOrderRepository.getOne(orderId));
		repository.save(entity);
		return converter.toDTO(entity);
	}

}
