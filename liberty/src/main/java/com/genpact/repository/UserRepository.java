package com.genpact.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.genpact.model.User;


public interface UserRepository extends CrudRepository<User, Integer> {
	List<User> findByAge(int age);
}
