package com.doantotnghiep.api.output;

import java.util.ArrayList;
import java.util.List;

import com.doantotnghiep.dto.DTOProduct;

public class ProductOutput {
	private int page;	//page hien tai 
	private int totalPage; //tong so page
	private List<DTOProduct> products = new ArrayList<>(); //so product moi page
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<DTOProduct> getProducts() {
		return products;
	}
	public void setProducts(List<DTOProduct> products) {
		this.products = products;
	}
}
