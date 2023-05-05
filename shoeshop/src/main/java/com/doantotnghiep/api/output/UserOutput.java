package com.doantotnghiep.api.output;

import java.util.ArrayList;
import java.util.List;

import com.doantotnghiep.dto.DTOUser;

public class UserOutput {
	private int page;	//page hien tai 
	private int totalPage; //tong so page
	private List<DTOUser> users = new ArrayList<>(); //so user moi page
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<DTOUser> getUsers() {
		return users;
	}
	public void setUsers(List<DTOUser> users) {
		this.users = users;
	}
}
