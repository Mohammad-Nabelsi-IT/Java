package com.example.ecommercesystem.Order;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
    public void deleteOrder(Order order) {
        orderRepository.delete(order);
    }
    public Order getOrder(Integer id) {
        return orderRepository.findById(id).get();
    }
    public List<Order> allOrders() {
        return (List<Order>) orderRepository.findAll();
    }

}
