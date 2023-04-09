package com.doantotnghiep.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class ImageEntity extends BaseEntity<ImageEntity>{

	@ManyToOne
	@JoinColumn(name="product_id")
	private ProductEntity product;
	
	@Column
	private String type;
	
	
	@Column
	@Lob
	private byte[]data;


	public ProductEntity getProduct() {
		return product;
	}


	public void setProduct(ProductEntity product) {
		this.product = product;
	}


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
	
}
