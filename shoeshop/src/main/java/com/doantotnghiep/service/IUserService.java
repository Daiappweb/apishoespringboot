package com.doantotnghiep.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.doantotnghiep.dto.DTOUser;

public interface IUserService {
	DTOUser saveDTO(DTOUser user,String roles);
	List<DTOUser>getAllUser();
	DTOUser findByUserName(String userName);
	DTOUser findByEmail(String email);
	List<DTOUser>findAll(Pageable pageable);
	int totalItem();
	List<DTOUser>findAll();
	List<DTOUser> deleteUsers(Long ids[]);
}
