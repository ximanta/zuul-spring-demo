package com.stackroute.restaurantspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
	
	@RequestMapping(value = "/user" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> displayRestaurant() {
		Map<String, String> map = new HashMap<>();
		map.put("message", "Hello from a user");
		map.put("motive", "To learn Spring Boot");
		return map;

	}
	
}
