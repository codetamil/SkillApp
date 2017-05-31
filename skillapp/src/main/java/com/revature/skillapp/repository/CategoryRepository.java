package com.revature.skillapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.skillapp.model.Category;
import com.revature.skillapp.model.Rating;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
