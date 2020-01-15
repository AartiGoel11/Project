package com.cgi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	UserRepository repo;
	
	@GetMapping("/hello")
	public String demo()
	{
		return "Hello";
	}
	
	@PostMapping("/hello11")
	public void add(@RequestBody User user)
	{ System.out.println("dfgdfg" +user);
		System.out.println(repo.save(user));
		System.out.println("added successfully");
	
	}
}
