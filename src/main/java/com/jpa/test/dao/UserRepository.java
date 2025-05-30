package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name,String city);
	
	@Query("select u FROM User u")
	public List<User> getAllUser();
	  
	@Query("select u FROM User u WHERE u.name =:n")
	public List<User> getUserByName(@Param("n") String name);
	
	@Query(value= "select * from user",nativeQuery= true)
	public List<User> getUsers();
	
}
