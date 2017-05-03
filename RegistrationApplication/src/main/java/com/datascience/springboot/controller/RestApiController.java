package com.datascience.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.datascience.springboot.model.User;
import com.datascience.springboot.service.UserService;
import com.datascience.springboot.util.CustomErrorType;

@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired
	UserService userService;

	/* USER REGISTRATION :: Create of CRUD */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
		logger.info("Creating User : {}", user);
		if (userService.isUserExist(user)) {
			logger.error("Unable to create. A User with name {} already exist", user.geteMail());
			return new ResponseEntity(
					new CustomErrorType("Unable to create. A User with name " + user.geteMail() + " already exist."),
					HttpStatus.CONFLICT);
		}
		if (!user.geteMail().equals(null) && !user.getfName().equals(null) && !user.getlName().equals(null)
				&& !user.getPassword().equals(null) && !user.getPhoneNo().equals(null) && userService.saveUser(user)
				&& !user.geteMail().isEmpty() && !user.getfName().isEmpty() && !user.getlName().isEmpty()
				&& !user.getPassword().isEmpty() && !user.getPhoneNo().isEmpty()) {
			userService.saveUser(user);
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(ucBuilder.path("/api/user/{id}").buildAndExpand(user.getuId()).toUri());
			return new ResponseEntity<String>(headers, HttpStatus.CREATED);
		} else {
			logger.error("Unable to create as the data is improper", user.geteMail());
			return new ResponseEntity(new CustomErrorType("Please check the request body"), HttpStatus.BAD_REQUEST);
		}

	}

	
}