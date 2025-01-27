package com.example.ecommercesystem.CartItems;

import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("cart_items")
public class CartItemsController {

    private CartItemsService cartItemsService;

    @Autowired
    public CartItemsController(CartItemsService cartItemsService) {
        this.cartItemsService = cartItemsService;
    }


    @PostMapping("/add")
    public String addCartItem(@RequestParam(value = "cart_id") int cartId
            , @RequestParam(value = "product_id") int productId
            , @RequestParam(value = "quantity") int quantity) {
        CartItems cartItems = new CartItems();
        cartItems.setCart_id(cartId);
        cartItems.setProduct_id(productId);
        cartItems.setQuantity(quantity);
        cartItemsService.createCartItems(cartItems);
        return "redirect:/cart_items/view";

    }

    @GetMapping("/view")
    public String viewCartItems(Model model) {
        // model.addAttribute("cart_items",cartItemsService.getCartItems());
        return "cart_items/view";
    }

    @GetMapping("/delete")
    public String deleteCartItem(@RequestParam(value = "id") int id) {
        CartItems cartItems = cartItemsService.getCartItems(id);
        cartItemsService.deleteCartItems(cartItems);
        return "redirect:/cart_items/view";
    }

    @GetMapping("/edit")
    public String editCartItem(Model model, @RequestParam(value = "id") int id) {
        CartItems cartItems = cartItemsService.getCartItems(id);
        model.addAttribute("cartItems", cartItems);
        return "cart_items/edit";
    }

    @GetMapping("update")
    public String updateCartItem(@RequestParam(value = "id") int id
            , @RequestParam(value = "cart_id") int cartId
            , @RequestParam(value = "product_id") int productId
            , @RequestParam(value = "quantity") int quantity) {
        CartItems cartItems = cartItemsService.getCartItems(id);
        cartItems.setCart_id(cartId);
        cartItems.setProduct_id(productId);
        cartItems.setQuantity(quantity);
        cartItems = cartItemsService.createCartItems(cartItems);
        return "redirect:/cart_items/view";
    }
}
