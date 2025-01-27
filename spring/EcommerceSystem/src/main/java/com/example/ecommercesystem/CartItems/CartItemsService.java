package com.example.ecommercesystem.CartItems;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemsService {
    private final CartItemsRepository cartItemsRepository;

    public CartItemsService(CartItemsRepository cartItemsRepository) {
        this.cartItemsRepository = cartItemsRepository;
    }

    public CartItems createCartItems(CartItems cartItems) {
        return cartItemsRepository.save(cartItems);
    }

    public void deleteCartItems(CartItems cartItems) {
        cartItemsRepository.delete(cartItems);
    }

    public CartItems getCartItems(Integer id) {
        return cartItemsRepository.findById(id).get();
    }

    public List<CartItems> allCartItems() {
        return (List<CartItems>) cartItemsRepository.findAll();
    }
}
