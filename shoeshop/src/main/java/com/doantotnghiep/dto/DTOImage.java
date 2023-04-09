package com.doantotnghiep.dto;



public class DTOImage extends DTOBase<DTOImage>{
	private DTOProduct product;
	private String type;
	private byte[]data;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	public DTOProduct getProduct() {
		return product;
	}
	public void setProduct(DTOProduct product) {
		this.product = product;
	}
	
}
