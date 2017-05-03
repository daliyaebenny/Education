package com.datascience.springboot.util;

import com.datascience.springboot.model.User;
import com.mongodb.DB;

public interface Database {
	public DB getConnection();
	public void saveData(User user);
	public Integer checkUserExists(String uName, String password);
}
