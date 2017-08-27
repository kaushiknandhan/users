package io.users.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.users.domain.User;
import io.users.service.UserService;

@RestController
@RequestMapping(path="/users",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UsersController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<User> findAll(){
		return userService.findAll();	
	}
	
	@RequestMapping(path="/{id}",method=RequestMethod.GET)
	public User findOne(@PathVariable(name="id") String id){
		System.out.println(id);
		return userService.findOne(id);
	}
	@RequestMapping(method=RequestMethod.POST)
	public User addOne(@RequestBody User user){
		return userService.addOne(user);
	}
}
