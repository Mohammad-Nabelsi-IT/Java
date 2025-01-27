package com.example.ecommercesystem.OrderItems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/order_items")
public class OrderItemsController {
    private OrderItemsService orderItemsService;

    @Autowired
    public OrderItemsController(OrderItemsService orderItemsService) {
        this.orderItemsService = orderItemsService;
    }

    @PostMapping("/add")
    String addOrderItem(@RequestParam(value = "orderId") int orderId
            , @RequestParam(value = "productId") int productId
            , @RequestParam(value = "quantity") int quantity
            , @RequestParam(value = "price") double price) {
        OrderItems orderItems = new OrderItems();
        orderItems.setOrderId(orderId);
        orderItems.setProductId(productId);
        orderItems.setQuantity(quantity);
        orderItems.setPrice(price);
        orderItemsService.createOrderItem(orderItems);
        return "redirect:/order_items/view";
    }

    @GetMapping("/view")
    public String view(Model model) {
        // model.addAttribute("order_items",orderItemsService.getOrderItems());
        return "order_items/view";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        OrderItems orderItems = orderItemsService.getOrderItems(id);
        orderItemsService.deleteOrderItem(orderItems);
        return "redirect:/order_items/view";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(value = "id") int id) {
        OrderItems orderItems = orderItemsService.getOrderItems(id);
        model.addAttribute("orderItems", orderItems);
        return "order_items/edit";
    }

    @GetMapping("/update")
    public String update(@RequestParam(value = "id") int id
            , @RequestParam(value = "order_id") int orderId
            , @RequestParam(value = "product_id") int productId
            , @RequestParam(value = "quantity") int quantity
            , @RequestParam(value = "price") double price) {
        OrderItems orderItems = orderItemsService.getOrderItems(id);
        orderItems.setOrderId(orderId);
        orderItems.setProductId(productId);
        orderItems.setQuantity(quantity);
        orderItems.setPrice(price);
        orderItems = orderItemsService.createOrderItem(orderItems);
        return "redirect:/order_items/view";

    }

}
