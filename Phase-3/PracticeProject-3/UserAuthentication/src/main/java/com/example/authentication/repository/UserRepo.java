package com.example.authentication.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.authentication.entity.User;

public interface UserRepo extends CrudRepository<User, Integer> {

	User findByName(String name);
}
