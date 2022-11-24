package com.generation.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.generation.project.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    
}