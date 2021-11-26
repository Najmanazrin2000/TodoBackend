package com.springboot.todo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.todo.entity.Todo;
import com.springboot.todo.services.TodoServices;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class TodoController {
	
	@Autowired
	TodoServices ts;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public Todo savingtodo(@RequestBody Todo t) {
		return ts.savetodo(t);
	}
	
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public List<Todo> view(){
		return ts.viewall();	
	}
}