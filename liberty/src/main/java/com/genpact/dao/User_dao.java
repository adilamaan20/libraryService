package com.genpact.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.genpact.model.User;


public interface User_dao {
	
	//public User addUser(User user);
	
	public List<User> findByAge(Integer age);
	
	public ResponseEntity<User> updateUser(Integer user_id, User user);
	
	public String deleteUser(Integer id);
	
	public User deleteAllUser(User delete);
			
	public List<User> getAllUser();

}
