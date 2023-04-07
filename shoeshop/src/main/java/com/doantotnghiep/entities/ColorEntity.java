package com.doantotnghiep.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="color")
public class ColorEntity extends BaseEntity{
	@ManyToMany(mappedBy="colors")
	private Set<ProductEntity>products;
}
