package com.doantotnghiep.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="brand")
public class BrandEntity extends BaseEntity<BrandEntity>{
	@OneToMany(mappedBy="brand")
	private Set<ProductEntity>products;
}
