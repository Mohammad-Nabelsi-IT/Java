package com.example.ecommercesystem.Order;

import com.example.ecommercesystem.User.User;
import jakarta.persistence.*;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_date")
    private LocalDate order_date;
    @Column(name = "total_price")
    private Double total_price;
    @Column(name = "order_status")
    private String  order_status;
    @ManyToOne
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Order() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public LocalDate getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDate order_date) {
        this.order_date = order_date;
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }


}
