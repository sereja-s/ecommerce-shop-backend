package com.zosh.service;

import com.zosh.exception.ProductException;
import com.zosh.model.Cart;
import com.zosh.model.User;
import com.zosh.request.AddItemRequest;

public interface CartService {

	Cart createCart(User user);

	String addCartItem(Long userId, AddItemRequest req) throws ProductException;

	Cart findUserCart(Long userId);

}
