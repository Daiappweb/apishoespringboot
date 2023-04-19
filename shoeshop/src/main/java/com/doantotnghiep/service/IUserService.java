package com.doantotnghiep.service;

import java.util.List;

import com.doantotnghiep.dto.DTOUser;

public interface IUserService {
	DTOUser saveDTO(DTOUser user,String roles);
	List<DTOUser>getAllUser();
	DTOUser findByUserName(String userName);
	DTOUser findByEmail(String email);
}
