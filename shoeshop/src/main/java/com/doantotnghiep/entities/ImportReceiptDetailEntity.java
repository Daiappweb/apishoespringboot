package com.doantotnghiep.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="importreceiptdetail")
public class ImportReceiptDetailEntity extends BaseEntity<ImportReceiptDetailEntity>{
	@OneToOne
	@JoinColumn(name="p_id", referencedColumnName="id")
	private ProductEntity product;
}
