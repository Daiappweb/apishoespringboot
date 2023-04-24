package com.doantotnghiep.dto;

public class CustomReponseWithToken {
	private String accessToken;
	private DTOUser user;
	private String refreshAccessToken;
	public String getRefreshAccessToken() {
		return refreshAccessToken;
	}
	public void setRefreshAccessToken(String refreshAccessToken) {
		this.refreshAccessToken = refreshAccessToken;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public DTOUser getUser() {
		return user;
	}
	public void setUser(DTOUser user) {
		this.user = user;
	}
	public CustomReponseWithToken(String accessToken, DTOUser user) {
		super();
		this.accessToken = accessToken;
		this.user = user;
	}
	public CustomReponseWithToken(String accessToken, DTOUser user, String refreshAccessToken) {
		super();
		this.accessToken = accessToken;
		this.user = user;
		this.refreshAccessToken = refreshAccessToken;
	}
	
	
	
}
