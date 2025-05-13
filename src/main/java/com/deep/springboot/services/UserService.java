package com.deep.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deep.springboot.entity.Userentity;
import com.deep.springboot.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	
	public Userentity addUser(Userentity userentity) {
		return repo.save(userentity);
	}


	public List<Userentity> getUser() {
		return repo.findAll();
	}

}
