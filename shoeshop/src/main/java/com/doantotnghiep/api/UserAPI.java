package com.doantotnghiep.api;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.doantotnghiep.dto.DTOUser;
import com.doantotnghiep.service.impl.UserService;



@RestController
@CrossOrigin(origins="*")

public class UserAPI {
	@Autowired
	private UserService service;
	
	
	@GetMapping(value="/user")
	public List<DTOUser> getAllUser() {
		return service.getAllUser();
	}
	
	@PostMapping(value="/user")
	public DTOUser saveDTO(@RequestBody DTOUser user,@RequestParam String role) {
		return service.saveDTO(user, role);
	}
	
	@GetMapping("/user/username")
	public DTOUser getByUserName(@PathParam(value = "userName") String userName) {
		return service.findByUserName(userName);
	}
	
	@GetMapping("/user/email")
	//pathParam: khi test nhập param và url hiển thị ?...
	public DTOUser getByEmail(@PathParam(value = "userName") String email) {
		return service.findByEmail(email);
	}
	


	@GetMapping(value="/user/login")
	//RequestPart: nhập theo form
	public ResponseEntity<String> checkUserExists(@PathParam(value = "userName") String userName,
			@PathParam(value = "password") String password) {

		Boolean result = service.checkExists(userName, password);
		return result?ResponseEntity.ok("User exists"):ResponseEntity.notFound().build();
    }

}
