package com.doantotnghiep.dto;

public class DTOCart {
	private DTOProduct product;
	private int quantity;
	private DTOUser user;
	public DTOProduct getProduct() {
		return product;
	}
	public void setProduct(DTOProduct product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public DTOUser getUser() {
		return user;
	}
	public void setUser(DTOUser user) {
		this.user = user;
	}
}
