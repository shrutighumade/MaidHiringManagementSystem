package com.anudip.maid.service;

import java.util.List;

import com.anudip.maid.entity.Category;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(Long id);
    Category saveCategory(Category category);
    void deleteCategory(Long id);
}
