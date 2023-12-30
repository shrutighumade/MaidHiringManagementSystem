package com.anudip.maid.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.maid.entity.Category;
import com.anudip.maid.entity.Maid;


//MaidRepository.java
public interface MaidRepository extends JpaRepository<Maid, Long> {

	List<Maid> findByCategory(Category category);
	

}
