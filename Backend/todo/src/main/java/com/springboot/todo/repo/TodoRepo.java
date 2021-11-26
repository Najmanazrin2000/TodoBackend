package com.springboot.todo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.todo.entity.Todo;

public interface TodoRepo extends MongoRepository<Todo, Integer>{

}
