package com.fekete.webapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.fekete.webapp.model.Door;

public interface DoorRepo extends CrudRepository<Door, Integer> {

}