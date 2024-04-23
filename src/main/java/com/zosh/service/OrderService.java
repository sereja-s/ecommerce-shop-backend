package com.zosh.service;

import java.util.List;

import com.zosh.exception.OrderException;
import com.zosh.model.Address;
import com.zosh.model.Order;
import com.zosh.model.User;

public interface OrderService {

	Order createOrder(User user, Address shippingAddress);

	Order findOrderById(Long orderId) throws OrderException;

	List<Order> usersOrderHistory(Long userId);

	Order placedOrder(Long orderId) throws OrderException;

	Order confirmedOrder(Long orderId) throws OrderException;

	Order shippedOrder(Long orderId) throws OrderException;

	Order deliveredOrder(Long orderId) throws OrderException;

	Order cancledOrder(Long orderId) throws OrderException;

	List<Order> getAllOrders();

	void deleteOrder(Long orderId) throws OrderException;
}
