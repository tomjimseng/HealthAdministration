package com.perscholas.health.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.perscholas.health.models.Login;

/**
 * Repository for login extending CrudRepository if needed to utilize create, read, update, delete methods.
 */

@Repository
public interface LoginRepository extends CrudRepository <Login, Long>{

	/**
	 * abstract method  to find user login information by checking specified email.
	 */
	
	Login findByEmail(String email);
	
}
