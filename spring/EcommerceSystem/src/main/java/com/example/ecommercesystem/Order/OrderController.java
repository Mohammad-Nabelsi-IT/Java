package com.example.ecommercesystem.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;
import java.time.LocalDate;

@Controller
@RequestMapping("orders")
public class OrderController {
    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/add")
    String add(@RequestParam(value = "id") int id
            , @RequestParam(value = "user_id") int user_id
            , @RequestParam(value = "order_date") LocalDate order_date
            , @RequestParam(value = "total_price") double total_price
            , @RequestParam(value = "order_status") String order_status) {
        Order order = new Order();
//        order.setUser_id(user_id);
        order.setOrder_date(order_date);
        order.setTotal_price(total_price);
        order.setOrder_status(order_status);
        orderService.createOrder(order);
        return "redirect:/orders/view";
    }

    @GetMapping("view")
    public String view(Model model) {
        // model.addAttribute("order", orderService.getOrder());
        return "orders/view";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        Order order = orderService.getOrder(id);
        orderService.deleteOrder(order);
        return "redirect:/orders/view";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(value = "id") int id) {
        Order order = orderService.getOrder(id);
        model.addAttribute("order", order);
        return "orders/edit";
    }

    @GetMapping("update")
    public String update(@RequestParam(value = "id") int id
            , @RequestParam(value = "user_id") int user_id
            , @RequestParam(value = "order_date") LocalDate order_date
            , @RequestParam(value = "total_price") double total_price
            , @RequestParam(value = "order_status") String order_status) {
        Order order = orderService.getOrder(id);
//        order.setUser_id(user_id);
        order.setOrder_date(order_date);
        order.setTotal_price(total_price);
        order.setOrder_status(order_status);
        order = orderService.createOrder(order);
        return "redirect:/orders/view";
    }


}
