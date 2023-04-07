package com.doantotnghiep.dto;



import java.util.Set;

public class DTOUser extends DTOBase<DTOUser>{
	private String userName;
	private String password;
	private String email;
	private String address;
	private Set<DTORole>roles;
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
	public Set<DTORole> getRoles() {
		return roles;
	}
	public void setRoles(Set<DTORole> roles) {
		this.roles = roles;
	}
	
}
