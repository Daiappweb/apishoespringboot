package com.doantotnghiep.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity extends BaseEntity{
	@Column 
	private String userName;
	@Column 
	private String password;
	@Column 
	private String email;
	@Column 
	private String address;
	
	@ManyToMany
	@JoinTable(name="user_role",
		joinColumns =@JoinColumn(name="user_id"),
		inverseJoinColumns = @JoinColumn(name="role_id")
			)
	private Set<RoleEntity>roles;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleEntity> roles) {
		this.roles = roles;
	}
	
	
}
