package com.example.hello;

import org.apache.logging.log4j.message.StructuredDataMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.Format;

@RestController
public class WebController {

    @GetMapping("/page1")
    public String hi(@RequestParam(value = "n", defaultValue = "Mohammad") String name) {
        return "Hi I am " + name;
    }


    @GetMapping("/page2")
    public String hello(@RequestParam(value = "zz", defaultValue = "Mohammad") String name) {
        return "Hello I am " + name;
    }

    @GetMapping("/add")
    public String add(@RequestParam(value = "n1") Integer x, @RequestParam(value = "n2") Integer y){
        return "sum = " + (x + y);
    }

    @PostMapping("/sub")
    public String sub(@RequestParam(value = "n1") Integer x, @RequestParam(value = "n2") Integer y){
        return "sum = " + (x - y);
    }


}
