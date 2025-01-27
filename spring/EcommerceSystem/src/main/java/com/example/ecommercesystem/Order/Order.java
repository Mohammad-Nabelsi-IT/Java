package com.example.ecommercesystem.Order;

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
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "order_date")
    private LocalDate order_date;
    @Column(name = "total_price")
    private Double total_price;
    @Column(name = "order_status")
    private String  order_status;

    public Order() {
    }

    public Order(int id, int user_id, LocalDate order_date, Double total_price, String order_status) {
        this.id = id;
        this.user_id = user_id;
        this.order_date = order_date;
        this.total_price = total_price;
        this.order_status = order_status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", order_date=" + order_date +
                ", total_price=" + total_price +
                ", order_status='" + order_status + '\'' +
                '}';
    }
}
