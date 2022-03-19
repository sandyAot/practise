package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@Autowired
	private service service;
	
	@GetMapping("/all")
	public List<model>getall(){
		return service.getall();
		
	}
	
	@GetMapping("/names")
	public List<model>names(){
		return service.getname();
	}
	@GetMapping("/{id}")
	public Optional<model>getbyid(@PathVariable Integer id){
		return service.getbyid(id);
	}
	
}
