package com.doantotnghiep.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_product")
public class OrderProductEntity extends BaseEntity<OrderProductEntity>{
	@Column
	private long price;
	@Column
	private long totalItem;
	@Column
	private int quantity;
	@ManyToOne
	@JoinColumn(name="product_id")
	private ProductEntity product;
	@ManyToOne
	@JoinColumn(name="order_id")
	private PurchaseOrderEntity purchaseOrder;
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getTotalItem() {
		return totalItem;
	}
	public void setTotalItem(long totalItem) {
		this.totalItem = totalItem;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ProductEntity getProduct() {
		return product;
	}
	public void setProduct(ProductEntity product) {
		this.product = product;
	}
	public PurchaseOrderEntity getPurchaseOrderEntity() {
		return purchaseOrder;
	}
	public void setPurchaseOrderEntity(PurchaseOrderEntity purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
	
	
}
