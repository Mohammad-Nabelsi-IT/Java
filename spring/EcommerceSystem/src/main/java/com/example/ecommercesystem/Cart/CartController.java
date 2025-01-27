package com.example.ecommercesystem.Cart;

import com.example.ecommercesystem.CartItems.CartItems;
import com.example.ecommercesystem.CartItems.CartItemsService;
import com.example.ecommercesystem.Order.OrderService;
import com.example.ecommercesystem.Product.Product;
import com.example.ecommercesystem.Product.ProductService;
import com.example.ecommercesystem.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cart")
public class CartController {
    private CartService cartService;
    @Autowired
    private ProductService productService;
    @Autowired
    private CartItemsService cartItemsService;
    @Autowired
    private UserService userService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @PostMapping("/add")
    String add(@RequestParam(value = "cart_id") int cart_id
            , @RequestParam(value = "user_id") int user_id) {
        Cart cart = new Cart();
        cart.setId(cart_id);
        cart.setUserId(user_id);
        cartService.createCart(cart);
        return "redirect:/cart/view";
    }

    @GetMapping()
    public String view(Model model, @RequestParam(value = "id") int id
            , @RequestParam(value = "user_id") int user_id) {
        model.addAttribute("cart", cartService.getCart(id));
        return "cart";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        Cart cart = cartService.getCart(id);
        cartService.deleteCart(cart);
        return "cart/delete";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(value = "id") int id
            , @RequestParam(value = "user_id") int user_id) {
        Cart cart = cartService.getCart(id);
        model.addAttribute("cart", cart);
        return "cart/edit";
    }

    @GetMapping("/update")
    public String update(@RequestParam(value = "id") int id
            , @RequestParam(value = "user_id") int user_id) {
        Cart cart = cartService.getCart(id);
        cart.setUserId(user_id);
        cart = cartService.createCart(cart);
        return "cart/update/view";
    }


    @GetMapping("/add")
    public String add(@RequestParam(value = "id") int id, Model model) {
        Product product = productService.getProduct(id);
        Cart cart = new Cart();
       // cart.setUserId(userService.getById(2));
        cartService.createCart(cart);
        CartItems cartItems = new CartItems();
        cartItems.setProduct_id(product.getId());
        cartItems.setCart_id(cart.getId());
        cartItems.setQuantity(1);
        cartItemsService.createCartItems(cartItems);

        return "cart";
    }

}
