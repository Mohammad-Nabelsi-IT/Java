package com.example.ecommercesystem.OrderItems;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemsService {
    private final OrderItemsRepository orderItemsRepository;

    public OrderItemsService(OrderItemsRepository orderItemsRepository) {
        this.orderItemsRepository = orderItemsRepository;
    }

    public OrderItems createOrderItem(OrderItems orderItems) {
        return orderItemsRepository.save(orderItems);
    }

    public void deleteOrderItem(OrderItems orderItems) {
        orderItemsRepository.delete(orderItems);
    }

    public OrderItems getOrderItems(Integer id) {
        return orderItemsRepository.findById(id).get();
    }
    public List<OrderItems> allOrderItems() {
        return (List<OrderItems>) orderItemsRepository.findAll();
    }
}
