package com.example.ecommercesystem.CartItems;

import com.example.ecommercesystem.Cart.Cart;
import com.example.ecommercesystem.Product.Product;
import jakarta.persistence.*;

@Entity
@Table(name = "cart_items")
public class CartItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    private Product product;
    @ManyToOne
    private Cart cart;

    public Product getProduct() {
        return product;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public CartItems() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
