package com.tech.springdatabase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tech.springdatabase.dao.AlienRepo;
import com.tech.springdatabase.model.Alien;

@RestController
public class AlienController {
	@Autowired
	AlienRepo repo;
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
		
	}
//	@RequestMapping("/addAlien")
//	public String addAlien(Alien alien) {
//		repo.save(alien);
//		return "home.jsp";
//	}
	
	//Post Request
	@PostMapping("/alien")
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	
	//print data using different url
	
//	@RequestMapping("/getAlien")
//	public ModelAndView getAlien(@RequestParam int aid) {
//		ModelAndView mv=new ModelAndView("showAlien.jsp");
//		Alien alien= repo.findById(aid).orElse(new Alien());
//		mv.addObject(alien);
//		return mv;
//	}
	
	//print data using different url
	@RequestMapping(path="/alien")
	public List<Alien> getAliens() {
		return (List<Alien>) repo.findAll();
	}
	
	//For deleting data from client side
	@RequestMapping("/aliens/{aid}")
	public void aliens(@PathVariable("aid") int aid) {
		repo.deleteById(aid);
		//return alien;
	}
	
	//searching data by using id
	@RequestMapping("/alien/{aid}")
	public Optional<Alien> getAliens(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}
	
	//for save or updating data from client
	@PutMapping("/alien")
	public Alien saveOrUpdateAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	
	
}
