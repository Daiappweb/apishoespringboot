package com.doantotnghiep.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="size")
public class SizeEntity extends BaseEntity{
	@ManyToMany(mappedBy="sizes")
	private Set<ProductEntity>products;
}
