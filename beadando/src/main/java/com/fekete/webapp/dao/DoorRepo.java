package com.fekete.webapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fekete.webapp.model.Door;

public interface DoorRepo extends CrudRepository<Door, Integer> {

	List<Door> findByName(String name);

	List<Door> findByIdGreaterThan(int id);

	@Query("from Door where name=?1 order by name")
	List<Door> findByNameSorted(String name);

}
