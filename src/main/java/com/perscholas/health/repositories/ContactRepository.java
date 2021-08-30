package com.perscholas.health.repositories;

import org.springframework.data.repository.CrudRepository;

import com.perscholas.health.models.Contact;

/**
 * Repository for contacts extending CrudRepository if needed to utilize create, read, update, delete methods.
 */

public interface ContactRepository extends CrudRepository <Contact, Long>{

}
