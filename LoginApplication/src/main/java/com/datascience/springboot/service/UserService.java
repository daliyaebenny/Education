package com.datascience.springboot.service;


import java.util.List;

import com.datascience.springboot.model.User;

public interface UserService {
	
	/*User findById(long id);*/
	
	Integer login(String uName,String password);
	
	/*User findByName(String name);
	
	boolean saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers();
	
	void deleteAllUsers();
	
	boolean isUserExist(User user);
	*/
}
