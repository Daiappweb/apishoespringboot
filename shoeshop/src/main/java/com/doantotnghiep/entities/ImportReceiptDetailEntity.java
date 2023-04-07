package com.doantotnghiep.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="importreceiptdetail")
public class ImportReceiptDetailEntity extends BaseEntity{
	@ManyToMany(mappedBy="importReceiptDetails")
	private Set<ProductEntity>products;
}
