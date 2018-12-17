package com.genpact.daoImpl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.genpact.dao.User_dao;
import com.genpact.model.User;
import com.genpact.repository.UserRepository;




@Service
public class UserImplementation implements User_dao{

	@Autowired
	private UserRepository repository;
	

	@Override
	public List<User> getAllUser() {
		List<User> user = new ArrayList<>();
		repository.findAll().forEach(user::add);
		return user;
	}


//	@Override
//	public User addUser(User user) {
//		repository.save(new User(user.getFirst_name(),user.getLast_name(),user.getEmail(),user.getAge(),
//						user.getPhone_no(),user.getPassword(),user.getRole_id(),user.getCreated_date(),user.getUpdated_date()));
//		
//		return user;
//	}


	@Override
	public List<User> findByAge(Integer age) {
		List<User> users = repository.findByAge(age);
		return  users;
	}


	@Override
	public ResponseEntity<User> updateUser(Integer user_id, User user) {
		
		java.util.Optional<User> userData = repository.findById(user_id);
		if (userData.isPresent()) {
			User _user = userData.get();
			_user.setFirst_name(user.getFirst_name());
			_user.setLast_name(user.getLast_name());
			_user.setAge(user.getAge());
			_user.setEmail(user.getEmail());
			_user.setPhone_no(user.getPhone_no());
			_user.setPassword(user.getPassword());
			_user.setIs_active(user.isIs_active());
			_user.setCreated_date(user.getCreated_date());
			_user.setUpdated_date(user.getUpdated_date());
			return new ResponseEntity<>(repository.save(_user), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


	@Override
	public String deleteUser(Integer user_id) {
		repository.deleteById(user_id);
		return "Success";
		
	}


	@Override
	public User deleteAllUser(User delete) {
		repository.deleteAll();
		return null;
	}


	
	
}
