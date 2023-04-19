package com.doantotnghiep.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doantotnghiep.dto.DTORole;
import com.doantotnghiep.service.impl.RoleService;

@RestController
public class RoleAPI {
	@Autowired
	private RoleService service;
	
	@PostMapping(value="/role")
	public DTORole saveDTO(@RequestBody DTORole role) {
		return service.saveDTO(role);
	}
}
