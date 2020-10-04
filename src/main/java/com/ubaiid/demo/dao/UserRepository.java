package com.ubaiid.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.ubaiid.demo.model.User;

public interface UserRepository extends CrudRepository<User, Integer>
{
	
}

