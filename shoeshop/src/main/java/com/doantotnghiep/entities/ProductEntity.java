package com.doantotnghiep.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity extends BaseEntity {
	@Column 
	private long quantity;
	
	@Column
	private long price;
	
	@Column(name="in_stock")
	private long inStock;
	
	@ManyToMany
	@JoinTable(name="product_image",
			joinColumns = @JoinColumn(name="product_id"),
		inverseJoinColumns = @JoinColumn(name="image_id")
			)
	private Set<ImageEntity>images;
	
	@ManyToMany
	@JoinTable(name="product_category",
		joinColumns = @JoinColumn(name="product_id"),
		inverseJoinColumns = @JoinColumn(name="category_id")
			)
	private Set<CategoryEntity>categories;
	
	@ManyToMany
	@JoinTable(name="product_color",
		joinColumns = @JoinColumn(name="product_id"),
		inverseJoinColumns = @JoinColumn(name="color_id")
			)
	private Set<ColorEntity>colors;
	
	@ManyToMany
	@JoinTable(name="product_size",
			joinColumns = @JoinColumn(name="product_id"),
			inverseJoinColumns = @JoinColumn(name="size_id")
			)
	private Set<SizeEntity>sizes;
	
	@ManyToOne
	@JoinColumn(name="brand_id")
	private BrandEntity brand;
	
	@ManyToMany
	@JoinTable(name="product_purchaseorderdetail",
			joinColumns = @JoinColumn(name="product_id"),
			inverseJoinColumns = @JoinColumn(name="purchaseorderdetail_id")
			)
	private Set<PurchaseOrderDetailEntity>purchaseOrderDetails;
	
	@ManyToMany
	@JoinTable(name="product_importreceiptdetail",
			joinColumns = @JoinColumn(name="product_id"),
			inverseJoinColumns = @JoinColumn(name="importreceiptdetail_id")
			)
	private Set<ImportReceiptDetailEntity>importReceiptDetails;
	


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

	public long getInStock() {
		return inStock;
	}

	public void setInStock(long inStock) {
		this.inStock = inStock;
	}

	public Set<ImageEntity> getImages() {
		return images;
	}

	public void setImages(Set<ImageEntity> images) {
		this.images = images;
	}

	public Set<CategoryEntity> getCategories() {
		return categories;
	}

	public void setCategories(Set<CategoryEntity> categories) {
		this.categories = categories;
	}

	public Set<ColorEntity> getColors() {
		return colors;
	}

	public void setColors(Set<ColorEntity> colors) {
		this.colors = colors;
	}

	public Set<SizeEntity> getSizes() {
		return sizes;
	}

	public void setSizes(Set<SizeEntity> sizes) {
		this.sizes = sizes;
	}

	public BrandEntity getBrand() {
		return brand;
	}

	public void setBrand(BrandEntity brand) {
		this.brand = brand;
	}

	public Set<PurchaseOrderDetailEntity> getPurchaseOrderDetails() {
		return purchaseOrderDetails;
	}

	public void setPurchaseOrderDetails(Set<PurchaseOrderDetailEntity> purchaseOrderDetails) {
		this.purchaseOrderDetails = purchaseOrderDetails;
	}

	public Set<ImportReceiptDetailEntity> getImportReceiptDetails() {
		return importReceiptDetails;
	}

	public void setImportReceiptDetails(Set<ImportReceiptDetailEntity> importReceiptDetails) {
		this.importReceiptDetails = importReceiptDetails;
	}
	
	
}
