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

	/* USER LOGIN :: Read of CRUD */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/user/{uName}/{password}", method = RequestMethod.GET)
	public ResponseEntity<?> loginUser(@PathVariable("uName") String uName, @PathVariable("password") String password) {
		logger.info("Fetching User for login");
		Integer user = 0 ;
		if ((!uName.equals(null) || uName != null || !uName.isEmpty())
				&& (!password.equals(null) || password != null || !uName.isEmpty())) {
			user = userService.login(uName, password);
		}
		if (user == 0) {
			logger.error("User with uName not found.", uName);
			return new ResponseEntity(new CustomErrorType("User with Username " + uName + " not found"),
					HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	

}