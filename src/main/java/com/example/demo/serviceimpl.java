package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class serviceimpl implements service {

	private reppo reppo;
	@Override
	public List<model> getall() {
		// TODO Auto-generated method stub
		return (List<model>) reppo.findAll();
	}

	@Override
	public void save(model mod) {
		// TODO Auto-generated method stub
		reppo.save(mod);
		
	}

	@Override
	public Optional<model> getbyid(Integer id) {
		// TODO Auto-generated method stub
		return reppo.findById(id);
	}

	@Override
	public List<model> getname() {
		List <model>md=(List<model>) reppo.findAll();
		return md.stream().sorted().collect(Collectors.toList());
		// TODO Auto-generated method stub
		
		
	}

}
