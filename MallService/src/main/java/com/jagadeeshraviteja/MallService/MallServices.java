package com.jagadeeshraviteja.MallService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MallServices
{
	@Autowired
	private MallRepository repo;
	
	//Get all the records from the table
	public List<Mallservice> listAll()
	{
		return repo.findAll();
	}
	
	
}
