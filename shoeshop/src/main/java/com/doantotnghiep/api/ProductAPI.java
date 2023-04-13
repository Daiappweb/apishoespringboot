package com.doantotnghiep.api;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.doantotnghiep.api.output.ProductOutput;
import com.doantotnghiep.dto.DTOProduct;
import com.doantotnghiep.service.impl.ProductService;

@CrossOrigin
@RestController
public class ProductAPI {
	@Autowired
	private ProductService service;
	
	@PostMapping(value="/product")
	public DTOProduct createProduct(@RequestPart DTOProduct product, @RequestParam MultipartFile[]files,@RequestPart String brand,
			String color,String category,String size) throws IOException {
		return service.saveDTO(product,files,brand,color,category,size);
	}
	
	@GetMapping(value = "/product")
	public ProductOutput getAllProduct(@RequestParam(value ="page",required = false) Integer page,
							 @RequestParam(value = "limit",required = false) Integer limit) {
		ProductOutput result = new ProductOutput();
		if(page!=null && limit !=null) {
			result.setPage(page);
			Pageable pageable = new PageRequest(page - 1, limit);
			result.setProducts(service.findAll(pageable));
			result.setTotalPage((int) Math.ceil((double) (service.totalItem()) / limit));
		}else {
			result.setProducts(service.findAll());
		}
		
		return result;
	}
	
	@GetMapping(value = "/product/{id}")
	public DTOProduct getProductById(@PathVariable Long id) {
		return service.findById(id);
	}
	
}

