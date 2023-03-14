package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;
	
	@Repository
	public interface UserRepo extends JpaRepository<User, Integer> {
		public List<User> findByName(String name);
		public List<User> findBySalary(int salar);
		public List<User> findByNameAndSalary(String name , double salary);
		public List<User> findByNameOrSalary(String name , double salary);
		public List<User> findByNameStartingWith(String name);
		public List<User> findBySalaryLessThan(double salary);
		
		@Query("select u From User u")
		public List<User> getAllUsers();
		
		@Query("select u from User u where u.name=:n")
		public List<User> getAllByName(@Param("n") String name);
		
		@Query("select u from User u where u.name=:n or u.salary=:s")
		public List<User> getAllByNameOrSalary(@Param("n") String name , @Param("s") double salary);


}
