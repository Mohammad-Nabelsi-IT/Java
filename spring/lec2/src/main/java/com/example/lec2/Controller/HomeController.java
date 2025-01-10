package com.example.lec2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    String home(){
        return "Hello";
    }

   @GetMapping("/hi")
    String hi(){
        return "Hi";
    }

}
