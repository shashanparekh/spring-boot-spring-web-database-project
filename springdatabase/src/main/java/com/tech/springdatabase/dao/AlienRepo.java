package com.tech.springdatabase.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tech.springdatabase.model.Alien;


public interface AlienRepo extends JpaRepository<Alien,Integer> {
		
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	 
	
//		//We can crrate custom name method for implemention complex query
//		List<Alien> findByTech(String tech);
//		List<Alien> findByAidGreaterThan(int aid);
//		//also with mapping annotation "QUERY" we can use custom name
//		@Query("from Alien where tech=?1 order by aname")
//		List<Alien> findByTechSorted(String tech);

}
