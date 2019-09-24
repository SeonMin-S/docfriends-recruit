package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class LoginService {

	@Autowired
	private LoginRepository loginrepository;
	
	public Optional<Login> FindOne(String id) {
	    return loginrepository.findOneById(id);
	  }
}
