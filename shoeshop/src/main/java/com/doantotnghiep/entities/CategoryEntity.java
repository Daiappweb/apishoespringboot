package com.doantotnghiep.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class CategoryEntity extends BaseEntity<CategoryEntity>{
	@ManyToMany(mappedBy="categories")
	private Set<ProductEntity>products;
}
