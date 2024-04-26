package com.zosh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.zosh.exception.ProductException;
import com.zosh.exception.UserException;
import com.zosh.model.Review;
import com.zosh.model.User;
import com.zosh.request.ReviewRequest;
import com.zosh.service.ReviewService;
import com.zosh.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
	@Autowired
	private ReviewService reviewService;
	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public ResponseEntity<Review> createReview(@RequestBody ReviewRequest req,
			@RequestHeader("Authorization") String jwt) throws UserException, ProductException {
		User user = userService.findUserProfileByJwt(jwt);
		Review review = reviewService.createReview(req, user);
		return new ResponseEntity<>(review, HttpStatus.CREATED);
	}

	@GetMapping("/product/{productId}")
	public ResponseEntity<List<Review>> getProductsReview(@PathVariable Long productId)
			throws UserException, ProductException {
		List<Review> reviews = reviewService.getAllReview(productId);
		return new ResponseEntity<>(reviews, HttpStatus.ACCEPTED);
	}
}
