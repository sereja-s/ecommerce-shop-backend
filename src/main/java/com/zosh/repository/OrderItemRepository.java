package com.zosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zosh.model.CartItem;
import com.zosh.model.Order;
import com.zosh.model.OrderItem;
import com.zosh.model.Product;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	@Query("SELECT oi FROM OrderItem oi where oi.order = :order and oi.product = :product and oi.size = :size and oi.userId = :userId")
	public CartItem isOrderItemExist(@Param("order") Order order, @Param("product") Product product,
			@Param("size") String size, @Param("userId") Long userId);
}