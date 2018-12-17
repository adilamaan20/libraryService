package com.genpact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genpact.dao.Admin_dao;
import com.genpact.model.User;
import com.genpact.repository.UserRepository;


@RestController
@RequestMapping("/secure/auth/")
public class AdminController {

	@Autowired
	private Admin_dao admin_dao;
	
	
	@PostMapping(value = "/users/create")
	//@RequestMapping(value = "/users/create", method = RequestMethod.POST)
	public User addUserByAdmin(@RequestBody User user) {
		User _user = admin_dao.addUserByAdmin(user);
		return _user;
	} 
	
//	@PostMapping(value = "/users/create")
//	//@RequestMapping(value = "/users/create", method = RequestMethod.POST)
//	public String addUserByAdmin(@RequestBody User user) {
//		admin_dao.addUserByAdmin(user);
//		return "Cretaed";
//	} 

//	/*@PreAuthorize("hasAnyRole('ADMIN')")*/
//	@PostMapping("/admin/add")
//	public String addUserByAdmin(@RequestBody User user) {
//		String pwd = user.getPassword();
//		String encryptPwd = passwordEncoder.encode(pwd);
//		user.setPassword(encryptPwd);
//		userRepository.save(user);
//		return "user added successfully...";
//	}

//	@PreAuthorize("hasAnyRole('ADMIN')")
//	@GetMapping("/admin/all")
//	public String securedHello() {
//		return "Secured Hello";
//	}
}
