package com.doantotnghiep.dto;



import java.util.Set;

public class DTOProduct extends DTOBase<DTOProduct>{
	private Set<DTOCategory>categories;
	private Set<DTOColor>colors;
	private Set<DTOImage>images;
	private Set<DTOSize>sizes;
	private DTOBrand brand;
	private Set<DTOOrderProduct>orderProducts;
	private Set<DTOImportReceiptDetail>importReceiptDetails;
	private long inStock;
	private long quantity;
	private long price;
	public Set<DTOCategory> getCategories() {
		return categories;
	}
	public void setCategories(Set<DTOCategory> categories) {
		this.categories = categories;
	}
	public Set<DTOColor> getColors() {
		return colors;
	}
	public void setColors(Set<DTOColor> colors) {
		this.colors = colors;
	}
	public Set<DTOImage> getImages() {
		return images;
	}
	public void setImages(Set<DTOImage> images) {
		this.images = images;
	}
	public Set<DTOSize> getSizes() {
		return sizes;
	}
	public void setSizes(Set<DTOSize> sizes) {
		this.sizes = sizes;
	}
	public DTOBrand getBrand() {
		return brand;
	}
	public void setBrand(DTOBrand brand) {
		this.brand = brand;
	}
	
	public Set<DTOOrderProduct> getOrderProducts() {
		return orderProducts;
	}
	public void setOrderProducts(Set<DTOOrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}
	public Set<DTOImportReceiptDetail> getImportReceiptDetails() {
		return importReceiptDetails;
	}
	public void setImportReceiptDetails(Set<DTOImportReceiptDetail> importReceiptDetails) {
		this.importReceiptDetails = importReceiptDetails;
	}
	public long getInStock() {
		return inStock;
	}
	public void setInStock(long inStock) {
		this.inStock = inStock;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
}
