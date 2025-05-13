package com.deep.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deep.springboot.entity.Userentity;
import com.deep.springboot.services.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping (path = "/addUser")
	@CrossOrigin(origins = "*")

	protected Userentity addUser(Userentity userentity) {
		return service.addUser(userentity);
	}
	
	@GetMapping (path = "/getUser")
	protected List<Userentity> getUser() {
		return service.getUser();
	}
}
