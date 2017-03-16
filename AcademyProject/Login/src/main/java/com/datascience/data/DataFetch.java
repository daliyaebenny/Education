package com.datascience.data;

import com.datascience.user.User;

public interface DataFetch {
	public void fetchData(String uName, String password, User user);
}
