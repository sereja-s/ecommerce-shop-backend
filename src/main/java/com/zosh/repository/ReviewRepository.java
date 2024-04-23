package com.zosh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zosh.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

	@Query("SELECT r FROM Review r WHERE r.product.id=:productId")
	List<Review> getAllProductReview(@Param("productId") Long productId);

}
