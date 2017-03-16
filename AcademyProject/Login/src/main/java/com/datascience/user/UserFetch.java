package com.datascience.user;

import org.json.simple.JSONObject;

public interface UserFetch {

	JSONObject getUser(String uName, String password);

}