package com.zosh.service;

import com.zosh.exception.CartItemException;
import com.zosh.exception.UserException;
import com.zosh.model.Cart;
import com.zosh.model.CartItem;
import com.zosh.model.Product;

public interface CartItemService {

	CartItem createCartItem(CartItem cartItem);

	CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws CartItemException, UserException;

	CartItem isCartItemExist(Cart cart, Product product, String size, Long userId);

	void removeCartItem(Long userId, Long cartItemId) throws CartItemException, UserException;

	CartItem findCartItemById(Long cartItemId) throws CartItemException;

}
