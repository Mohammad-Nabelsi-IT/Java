package com.example.lec2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hr")

public class HrController {

    @GetMapping("/hello")
    String home(){
        return "Hellooooooooooooooooooooooo";
    }

    @GetMapping("/hi")
    String hi(){
        return "Hiiiiiiiiiiiiiiiiiiiiiiiiiiiii";
    }

}
