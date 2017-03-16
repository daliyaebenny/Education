package com.datascience.rest;


import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import org.json.simple.JSONObject;
import com.datascience.context.SpringApplicationContext;
import com.datascience.user.UserFetch;

@Path("/Student")
public class LoginService {

	UserFetch userFetch;

	@GET
	@Path("/login/values")
	@Produces("application/json")
	public Response printMessage(@QueryParam("name") String uName,@QueryParam("password")String password) {

		userFetch = (UserFetch) SpringApplicationContext.getBean("userFetch");
		JSONObject result = userFetch.getUser( uName,password);
		return Response.status(200).entity(result).build();

	}

}