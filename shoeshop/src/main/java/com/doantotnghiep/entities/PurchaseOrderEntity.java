package com.doantotnghiep.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="purchaseorder")
public class PurchaseOrderEntity extends BaseEntity<PurchaseOrderEntity>{
	
	@Column(name="totalAmount")
	private long totalAmount;
	@OneToMany(mappedBy="purchaseOrder",cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<OrderProductEntity>orderProducts;
	

	public long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Set<OrderProductEntity> getOrderProducts() {
		return orderProducts;
	}

	public void setOrderProducts(Set<OrderProductEntity> orderProducts) {
		this.orderProducts = orderProducts;
	}
	
	
}
