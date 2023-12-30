package com.anudip.maid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.maid.entity.Review;
import com.anudip.maid.service.ReviewService;

@RestController
@RequestMapping("/api/ratings")
public class ReviewController {
	ReviewService reviewService;

	@Autowired
	public ReviewController(ReviewService reviewService) {
		super();
		this.reviewService = reviewService;
	}
	
   /* @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }*/

    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable Long id) {
        return reviewService.getReviewById(id);
    }

    @PostMapping
    public Review createRating(@RequestBody Review review) {
        return reviewService.saveReview(review);
    }

    @PutMapping("/{id}")
    public Review updateRating(@PathVariable Long id, @RequestBody Review review) {
        if (!id.equals(review.getId())) {
            throw new IllegalArgumentException("ID in path must match ID in request body");
        }
        return reviewService.saveReview(review);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
    }
	
	
	

}
