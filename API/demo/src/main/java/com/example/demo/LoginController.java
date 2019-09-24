package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public class LoginController {

	@Autowired
	private LoginService loginservice;
	
	@PostMapping(value = "/login")
	  public ResponseEntity login(
	      @RequestParam String id
	      , @RequestParam String pwd
	  ) {
		loginservice.FindOne(id).ifPresent(r->{
			if(r.getPwd().equals(pwd){
				return ResponseEntity.ok("success");	
			}
		});			
	}

}
