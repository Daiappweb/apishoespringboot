package com.doantotnghiep.dto;

import java.util.Set;

public class DTOOrder extends DTOBase<DTOOrder> {
	private long totalAmount;
	private Set<DTOOrderProduct> orderProducts;

	public long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Set<DTOOrderProduct> getOrderProducts() {
		return orderProducts;
	}

	public void setOrderProducts(Set<DTOOrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}

}
