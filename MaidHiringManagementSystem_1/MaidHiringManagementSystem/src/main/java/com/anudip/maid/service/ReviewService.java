package com.anudip.maid.service;

import java.util.List;

import com.anudip.maid.entity.Review;

public interface ReviewService {
    
    Review getReviewById(Long id);
    Review saveReview(Review review);
    void deleteReview(Long id);
//	List<Review> getAllReviews();
//	List<Review> getAllReviews();
	List<Review> getAllReviews();
}
