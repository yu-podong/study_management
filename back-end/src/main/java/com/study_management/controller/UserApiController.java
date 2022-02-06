package com.study_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study_management.domain.User;

@RestController
public class UserApiController {
	@GetMapping("/api/users")
	public User user() {
		System.out.println("UserApiController 진입");

		User user = new User(1, "홍길동", "ma123", "1234");

		return user;
	}

}