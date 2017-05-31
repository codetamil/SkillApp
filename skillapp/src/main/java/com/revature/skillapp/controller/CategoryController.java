package com.revature.skillapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.skillapp.repository.CategoryRepository;

import com.revature.skillapp.model.*;

@CrossOrigin
@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	private CategoryRepository categoryRepo;
	
	@GetMapping
	public List<Category> findAll()
	{
		
		return categoryRepo.findAll();
		
	}
	
	@PostMapping
	public Category save(@RequestBody Category category)
	{
		Category cc=categoryRepo.save(category);
		
		return cc;
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Category category) {
		categoryRepo.save(category);
	}

}
