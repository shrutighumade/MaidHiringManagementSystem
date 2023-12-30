package com.anudip.maid.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.maid.entity.Review;
import com.anudip.maid.repository.ReviewRepository;
import com.anudip.maid.service.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService {
	ReviewRepository reviewRepository;
	
	@Autowired
	public ReviewServiceImpl(ReviewRepository reviewRepository) {
		super();
		this.reviewRepository = reviewRepository;
	}

	@Override
	public Review getReviewById(Long id) {
		// TODO Auto-generated method stub
		return  reviewRepository.findById(id).orElse(null);
	}

	@Override
	public Review saveReview(Review review) {
		// TODO Auto-generated method stub
		return reviewRepository.save(review);
	}

	@Override
	public void deleteReview(Long id) {
		// TODO Auto-generated method stub
		reviewRepository.deleteById(id);
		
	}

	@Override
	public List<Review> getAllReviews() {
		// TODO Auto-generated method stub
		return  reviewRepository.findAll();
	}


	

}
