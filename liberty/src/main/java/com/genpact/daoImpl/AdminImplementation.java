package com.genpact.daoImpl;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.genpact.dao.Admin_dao;

import com.genpact.model.User;
import com.genpact.repository.UserRepository;
@Service
public class AdminImplementation implements Admin_dao {
	
	
	@Autowired
	private UserRepository repository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public User addUserByAdmin(User user) {
		String pwd = user.getPassword();
		String encryptPwd = passwordEncoder.encode(pwd);
		user.setPassword(encryptPwd);
		java.util.Date utilDate = new java.util.Date();
	    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		user.setCreated_date(sqlDate);
		user.setUpdated_date(sqlDate);
		user.setIs_active(true);
		
//		Role role = new Role();
//		role.setRole_id(role_id);
		
		/*if (user.getRoleId().getRole_id()==1) {
		}
		else
			user.setIs_active(false);*/
		
//		repository.save(new User(user.getFirst_name(),user.getLast_name(),user.getEmail(),user.getAge(),
//				user.getPhone_no(),user.getPassword(),user.getRole_id(),user.getCreated_date(),user.getUpdated_date()));
		
		repository.save(user);

return user;
	}

}
