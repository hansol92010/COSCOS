package com.coscos.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coscos.config.UserDetailsServiceImpl;
import com.coscos.entity.Member;

@RestController
public class LoginController {
	
	@Autowired
	private UserDetailsServiceImpl userDetails;
	
	@PostMapping("/coscos/doLogin")
	public ResponseEntity<UserDetails> loginProcess(@RequestBody Member member, HttpSession session) {
		System.out.println("######################" + member);
		UserDetails user = userDetails.loadUserByUsername(member.getUserId());
		if(user != null) {
			session.setAttribute("user", user);
			System.out.println("##################" + user);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

}
