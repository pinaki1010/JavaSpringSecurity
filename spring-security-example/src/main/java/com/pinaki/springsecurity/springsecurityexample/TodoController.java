package com.pinaki.springsecurity.springsecurityexample;

import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private static final List<Todo> TODO_LIST = List.of(new Todo("Pinaki","Java"),new Todo("Sattwiki","1234"));
	
	@GetMapping("/allTodo")
	public List<Todo> retriveAllData(){
		
		return TODO_LIST;
		
	}
	
	@GetMapping("/users/{username}/todo")
	public Todo retriveSpecifcUserData(@PathVariable String username){
		
		return TODO_LIST.get(0);
		
	}
	
	@PostMapping("/users/{username}/todos")
	public void createUserData(@PathVariable String username,@RequestBody Todo todo){
		
		logger.info("Create {} for {}",username,todo);
		
	}
	
	
	record Todo(String username,String description) {};

}
