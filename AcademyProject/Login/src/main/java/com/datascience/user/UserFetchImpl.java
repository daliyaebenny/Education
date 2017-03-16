package com.datascience.user;

import org.json.simple.JSONObject;
import com.datascience.context.SpringApplicationContext;
import com.datascience.data.DataFetch;

public class UserFetchImpl implements UserFetch {
	DataFetch dataFetch = (DataFetch) SpringApplicationContext.getBean("dataFetch");
	User user = new User();
	public JSONObject getUser(String uName, String password) {
		JSONObject obj = new JSONObject();
		dataFetch.fetchData(uName, password, user);

		if (user.getName() != null && user.getUserId() != 0) {
			obj.put("id", user.getUserId());
			obj.put("Name", user.getName());
		} else {
			obj.put("id", 0);
			obj.put("Name", "");
		}

		return obj;

	}

}
