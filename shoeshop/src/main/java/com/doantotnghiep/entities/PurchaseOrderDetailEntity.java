package com.doantotnghiep.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="purchaseorderdetail")
public class PurchaseOrderDetailEntity extends BaseEntity<PurchaseOrderDetailEntity>{
	@ManyToMany(mappedBy="purchaseOrderDetails")
	private Set<ProductEntity>products;
	
}
