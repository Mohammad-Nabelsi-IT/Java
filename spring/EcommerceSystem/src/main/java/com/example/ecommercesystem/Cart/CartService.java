package com.example.ecommercesystem.Cart;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    private CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public void deleteCart(Cart cart) {
        cartRepository.delete(cart);
    }

    public Cart getCart(Integer id) {
        return cartRepository.findById(id).get();
    }

    public List<Cart> allCarts() {
        return (List<Cart>) cartRepository.findAll();
    }


}
