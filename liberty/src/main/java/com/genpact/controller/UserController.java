package com.genpact.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.genpact.dao.User_dao;
import com.genpact.model.User;


//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private User_dao user_dao;
	
	@GetMapping("/users")
	public List<User> getAllUser() {
		
		List<User> listUser = user_dao.getAllUser();
		return listUser;
	}
	
//	@PostMapping(value = "/users/create")
//	//@RequestMapping(value = "/users/create", method = RequestMethod.POST)
//	public User postUser(@RequestBody User user) {
//		User _user = user_dao.addUser(user);
//		return _user;
//	} 
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("user_id") int user_id) {
		System.out.println("Delete User with ID = " + user_id + "...");
		
		user_dao.deleteUser(user_id);

		return new ResponseEntity<>("User has been deleted!", HttpStatus.OK);
	}
	
	@DeleteMapping("/users/delete")
	public ResponseEntity<String> deleteAllUsers(User delete) {
		System.out.println("Delete All Users...");
		
		user_dao.deleteAllUser(delete);

		return new ResponseEntity<>("All users have been deleted!", HttpStatus.OK);
	}
	
	@GetMapping(value = "users/age/{age}")
	public List<User> findByAge(@PathVariable int age) {

		List<User> _user = user_dao.findByAge(age);
		return _user;
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("user_id") int user_id, @RequestBody User user) {
		System.out.println("Update User with ID = " + user_id + "...");

		ResponseEntity<User> _user= user_dao.updateUser(user_id, user);
		
		return _user;
	}

}














//<dependency>
//<groupId>org.springframework.boot</groupId>
//<artifactId>spring-boot-starter-security</artifactId>
//</dependency>
