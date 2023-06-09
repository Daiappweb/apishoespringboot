package com.doantotnghiep.api;

import java.util.Collections;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.doantotnghiep.api.output.UserOutput;
import com.doantotnghiep.config.JwtUtils;
import com.doantotnghiep.dto.CustomReponseWithToken;
import com.doantotnghiep.dto.DTOUser;
import com.doantotnghiep.service.impl.UserService;



@RestController
@CrossOrigin(origins="*")

public class UserAPI {
	@Autowired
	private UserService service;
	
	
	@GetMapping(value="/user")
	public UserOutput getAllUser(@RequestParam(value ="page",required = false) Integer page,
			 @RequestParam(value = "limit",required = false) Integer limit) {
		UserOutput result = new UserOutput();
		if(page!=null && limit !=null) {
			result.setPage(page);
			Pageable pageable = new PageRequest(page - 1, limit);
			result.setUsers(service.findAll(pageable));
			result.setTotalPage((int) Math.ceil((double) (service.totalItem()) / limit));
		}else {
			result.setUsers(service.findAll());
		}
		return result;
		
	
		
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
	
	//delete list user
	@DeleteMapping(value= "/user")
	public List<DTOUser> deleteUsers(@RequestParam(required = false) Long[]ids) {
		if(ids ==null || ids.length == 0) {
			return Collections.emptyList();
		}
		return service.deleteUsers(ids);
	}
	


	@GetMapping(value="/user/login")
	//RequestPart: nhập theo form
	public ResponseEntity<?> checkUserExists(@PathParam(value = "userName") String userName,
			@PathParam(value = "password") String password) {

		DTOUser result = service.checkExists(userName, password);
		if(result !=null) {
			String accessToken = JwtUtils.generateAccessToken(result.getUserName());
			String refreshToken = JwtUtils.generateRefreshToken(result.getUserName());
			CustomReponseWithToken response = new CustomReponseWithToken(accessToken, result,refreshToken);
			return ResponseEntity.ok().body(response);
		}
		HttpStatus status = HttpStatus.NOT_FOUND;
		String message = "User does not exist";
		return ResponseEntity.status(status).body(message);
    }
	
	//refresh AccessToken
	@PostMapping("/user/refresh")
	public ResponseEntity<?> refreshAccessToken(@RequestBody CustomReponseWithToken refreshTokenRequest) {
	    // Kiểm tra tính hợp lệ của refresh token
	    if (JwtUtils.validateRefreshToken(refreshTokenRequest.getRefreshAccessToken())) {
	        // Lấy thông tin người dùng từ refresh token
	        String userName = JwtUtils.extractUserName(refreshTokenRequest.getRefreshAccessToken());
	        // Tạo access token mới
	        String newAccessToken = JwtUtils.generateAccessToken(userName);
	        // Trả về access token mới
	        return ResponseEntity.ok().body(newAccessToken);
	    } else {
	        // Nếu refresh token không hợp lệ
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Refresh token is invalid");
	    }
	}
	
	


}
