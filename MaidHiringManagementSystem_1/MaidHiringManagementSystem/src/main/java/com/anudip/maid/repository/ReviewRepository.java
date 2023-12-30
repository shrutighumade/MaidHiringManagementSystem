package com.anudip.maid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.maid.entity.Review;


public interface ReviewRepository extends JpaRepository<Review, Long> {

}
