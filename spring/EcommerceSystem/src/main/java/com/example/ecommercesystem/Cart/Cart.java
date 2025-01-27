package com.example.ecommercesystem.Cart;

import com.example.ecommercesystem.CartItems.CartItems;
import com.example.ecommercesystem.User.User;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "cart")
    private List<CartItems> cartItemsList;

    public List<CartItems> getCartItemsList() {
        return cartItemsList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCartItemsList(List<CartItems> cartItemsList) {
        this.cartItemsList = cartItemsList;
    }



    public Cart() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
