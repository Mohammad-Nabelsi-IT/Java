package com.example.ecommercesystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }


    @GetMapping("/user_add")
    public String user_add() {
        return "user_add";
    }



}
