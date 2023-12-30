package com.anudip.maid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.maid.entity.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
