package com.example.ecommercesystem.Cart;

import com.example.ecommercesystem.CartItems.CartItems;
import com.example.ecommercesystem.CartItems.CartItemsService;
import com.example.ecommercesystem.Order.OrderService;
import com.example.ecommercesystem.Product.Product;
import com.example.ecommercesystem.Product.ProductService;
import com.example.ecommercesystem.User.User;
import com.example.ecommercesystem.User.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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


    @GetMapping("/add")
    String add(HttpSession session , @RequestParam(value = "id") int id) {
      User user= (User) session.getAttribute("user");
      Product product =productService.getProduct(id);
      if (user == null) {
          return "redirect:/login";
      }else{
          Cart cart = null;
          List<Cart> userCarts = userService.findUserWithCartById(user.getId()).getCart();
          if (userCarts == null || userCarts.size() == 0) {
              cart = new Cart();
              cart.setUser(user);
              cartService.createCart(cart);
          }else{
              cart = userCarts.get(0);
          }

          CartItems cartItems = new CartItems();
          cartItems.setProduct(product);
          cartItems.setCart(cart);
          cartItems.setQuantity(1);
          cartItemsService.createCartItems(cartItems);
          return "redirect:/cart";
      }

    }

    @GetMapping()
    public String view(HttpSession session , Model model) {
        User user= (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";
        }else{
//            model.addAttribute("carts", user.getCart());
            User user1 = userService.findUserWithCartById(user.getId());
            model.addAttribute("cartItems", user1.getCart().get(0).getCartItemsList());
        return "cart";
        }
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        Cart cart = cartService.getCart(id);
        cartService.deleteCart(cart);
        return "cart/delete";
    }

    @GetMapping("/deleteItem")
    public String deleteCartItem(@RequestParam(value = "id") int id) {
        CartItems cartItem = cartItemsService.getCartItems(id);
        cartItemsService.deleteCartItems(cartItem);
        return "redirect:/cart";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(value = "id") int id
            , @RequestParam(value = "user_id") int user_id) {
        Cart cart = cartService.getCart(id);
        model.addAttribute("cart", cart);
        return "cart/edit";
    }




}
