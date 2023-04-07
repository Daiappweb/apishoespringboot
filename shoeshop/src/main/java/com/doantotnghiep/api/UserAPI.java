package com.doantotnghiep.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAPI {
	@GetMapping(value="/user")
	public String getUser() {
		return "hello";
	}
}
