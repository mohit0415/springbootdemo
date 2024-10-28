package com.example.d.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.d.UserRepo;
import com.example.d.model.UserData;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/plan")
public class IndexController {
	
	@Autowired
	UserRepo repo;
	
	@PostMapping("/doPost")
	public UserData addUser(@RequestBody UserData dt)
	{
		return repo.save(dt);
	}
	
	@GetMapping("/doGet")
	public List<UserData> viewUser()
	{
		return repo.findAll();
	}

}
