package com.anudip.maid.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.maid.entity.Category;
import com.anudip.maid.repository.CategoryRepository;
import com.anudip.maid.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	CategoryRepository categoryRepository;
	


	@Autowired
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category getCategoryById(Long id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id).orElse(null);
	}

	@Override
	public Category saveCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public void deleteCategory(Long id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
		
	}

	
}
