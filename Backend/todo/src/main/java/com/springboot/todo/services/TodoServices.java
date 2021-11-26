package com.springboot.todo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.todo.entity.Todo;
import com.springboot.todo.repo.TodoRepo;


@Service
public class TodoServices {
	
	
	@Autowired
	TodoRepo tr;
	
	public Todo savetodo(Todo t) {
		tr.save(t);
		return t;
	}
	
	public List<Todo> viewall(){
		return tr.findAll();
	}

}