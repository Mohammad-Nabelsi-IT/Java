package com.example.ecommercesystem.CartItems;

import jakarta.persistence.*;

@Entity
@Table(name = "cart_items")
public class CartItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cart_id")
    private int cart_id;
    @Column(name = "product_id")
    private int product_id;
    @Column(name = "quantity")
    private int quantity;

    public CartItems() {
    }

    public CartItems(int id, int cart_id, int product_id, int quantity) {
        this.id = id;
        this.cart_id = cart_id;
        this.product_id = product_id;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartIems{" +
                "id=" + id +
                ", cart_id=" + cart_id +
                ", product_id=" + product_id +
                ", quantity=" + quantity +
                '}';
    }
}
