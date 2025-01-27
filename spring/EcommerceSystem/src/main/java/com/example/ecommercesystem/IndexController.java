package com.example.ecommercesystem;

import com.example.ecommercesystem.Product.Product;
import com.example.ecommercesystem.Product.ProductService;
import com.example.ecommercesystem.User.User;
import com.example.ecommercesystem.User.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @Autowired
    UserService userService;
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String index(HttpSession session, Model model) {
        model.addAttribute("products", productService.allProducts());
        User user = (User) session.getAttribute("user");
        model.addAttribute("user", user);
        return "index";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:/";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginAction(HttpSession session, Model model , @RequestParam(value = "email") String email
            , @RequestParam(value = "password") String password) {

        User user = userService.getByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            session.setAttribute("user", user);
            return "redirect:/";
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }
    }


    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/products")
    public String products() {
        return "products";
    }


}
