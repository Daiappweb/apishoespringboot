package com.doantotnghiep.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class RoleEntity extends BaseEntity<RoleEntity>{
	@ManyToMany(mappedBy="roles")
	private Set<UserEntity>users;
}
