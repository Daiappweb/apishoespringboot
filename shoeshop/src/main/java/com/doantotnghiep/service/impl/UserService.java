package com.doantotnghiep.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.doantotnghiep.converter.UserConverter;
import com.doantotnghiep.dto.DTOUser;
import com.doantotnghiep.entities.RoleEntity;
import com.doantotnghiep.entities.UserEntity;
import com.doantotnghiep.repository.RoleRepository;
import com.doantotnghiep.repository.UserRepository;
import com.doantotnghiep.service.IUserService;

@Service
public class UserService implements IUserService{
	@Autowired
	private UserConverter converter;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private UserRepository repository;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Override
	public DTOUser saveDTO(DTOUser user, String  role) {
		UserEntity entity = converter.toEntity(user);
		Set<RoleEntity> roleEntities = new HashSet<>();
		String []roles = role.split("-");
		for (String item : roles) {
			roleEntities.add(roleRepository.findOneByCode(item));
		}
		entity.setUserName(user.getUserName());
		entity.setAddress(user.getAddress());
		entity.setPassword(passwordEncoder.encode(user.getPassword()));
		entity.setEmail(user.getEmail());
		entity.setRoles(roleEntities);
		
		repository.save(entity);
		return converter.toDTO(entity);
	}

	@Override
	public List<DTOUser> getAllUser() {
		List<UserEntity>userEntities = repository.findAll();
		List<DTOUser>dtoUsers = new ArrayList<DTOUser>();
		for (UserEntity entity : userEntities) {
			dtoUsers.add(converter.toDTO(entity));
		}
		return dtoUsers;
	}

	@Override
	public DTOUser findByUserName(String userName) {
		UserEntity entity = repository.findOneByUserName(userName);
		return entity!=null?converter.toDTO(entity):null;
	}
	
	public boolean checkExists(String userName,String password) {
		UserEntity entity = repository.findOneByUserName(userName);
		DTOUser user = new DTOUser();
		if(entity==null) {
			return false;
		}
		user = converter.toDTO(entity);
		if(passwordEncoder.matches(password, user.getPassword())) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public DTOUser findByEmail(String email) {
		UserEntity entity = repository.findOneByEmail(email);
		return converter.toDTO(entity);
	}
	
	

}
