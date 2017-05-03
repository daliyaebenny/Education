package com.datascience.springboot.service;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datascience.springboot.model.User;
import com.datascience.springboot.util.Database;
import com.datascience.springboot.util.Validation;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	Database database;

	private static final AtomicLong counter = new AtomicLong();

	private static List<User> users;

	static {
		users = populateUsers();
	}

	public List<User> findAllUsers() {
		return users;
	}

	public User findById(long id) {
		for (User user : users) {
			if (user.getuId() == id) {
				return user;
			}
		}
		return null;
	}

	public User login(String uName, String password) {
		for (User user : users) {
			if ((user.geteMail().equals(uName) || user.getPhoneNo().equals(uName))
					&& user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

	public User findByName(String name) {
		for (User user : users) {
			if (user.getfName().equalsIgnoreCase(name)) {
				return user;
			}
		}
		return null;
	}

	public boolean findByUname(String uName, String password) {
		if (database.checkUserExists(uName, password)) {
			return true;
		}
		return false;
	}

	public boolean saveUser(User user) {
		if (Validation.validatePhoneNumber(user.getPhoneNo()) && Validation.validateEmail(user.geteMail())
				&& Validation.validatePhoneNumber(user.getPhoneNo())) {
			/*
			 * user.setuId(counter.incrementAndGet()); users.add(user);
			 */
			database.saveData(user);
			return true;
		} else
			return false;
	}

	public void updateUser(User user) {
		int index = users.indexOf(user);
		users.set(index, user);
	}

	public void deleteUserById(long id) {

		for (Iterator<User> iterator = users.iterator(); iterator.hasNext();) {
			User user = iterator.next();
			if (user.getuId() == id) {
				iterator.remove();
			}
		}
	}

	public boolean isUserExist(User user) {
		return findByUname(user.geteMail(), user.getPassword());
	}

	public void deleteAllUsers() {
		users.clear();
	}

	private static List<User> populateUsers() {
		List<User> users = new ArrayList<User>();

		return users;
	}

}
