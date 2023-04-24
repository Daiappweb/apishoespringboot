package com.doantotnghiep.dto;

public class DTOOrderProduct extends DTOBase<DTOOrderProduct>{
	private long totalItem;
	private long price;
	private int quantity;
	private DTOProduct product;
	private DTOOrder order;
	public long getTotalItem() {
		return totalItem;
	}
	public void setTotalItem(long totalItem) {
		this.totalItem = totalItem;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public DTOProduct getProduct() {
		return product;
	}
	public void setProduct(DTOProduct product) {
		this.product = product;
	}
	public DTOOrder getOrder() {
		return order;
	}
	public void setOrder(DTOOrder order) {
		this.order = order;
	}
}
