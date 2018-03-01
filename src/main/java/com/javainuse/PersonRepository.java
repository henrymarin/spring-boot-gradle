package com.javainuse;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends JpaRepository<Person, Long>{

	
	@Query(" SELECT p FROM Person p WHERE UPPER(p.firstName) like %:firstnameInput%" )
	List<Person> getPByFirstName(@Param("firstnameInput")String firstnameInput);
	
}
