package com.doantotnghiep.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class ImageEntity extends BaseEntity<ImageEntity>{
	@ManyToMany(mappedBy="images")
	private Set<ProductEntity>products;
}
