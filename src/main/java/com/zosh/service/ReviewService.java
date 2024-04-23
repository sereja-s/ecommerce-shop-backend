package com.zosh.service;

import java.util.List;

import com.zosh.exception.ProductException;
import com.zosh.model.Review;
import com.zosh.model.User;
import com.zosh.request.ReviewRequest;

public interface ReviewService {

	Review createReview(ReviewRequest req, User user) throws ProductException;

	List<Review> getAllReview(Long productId);

}
