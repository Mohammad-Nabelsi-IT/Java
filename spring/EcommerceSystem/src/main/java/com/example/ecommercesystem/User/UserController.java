package com.example.ecommercesystem.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    String add(@RequestParam(value = "user_name") String user_name
            , @RequestParam(value = "password") String password
            , @RequestParam(value = "email") String email
            , @RequestParam(value = "role") String role) {

        User user = new User();
        user.setUser_name(user_name);
        user.setPassword(password);
        user.setEmail(email);
        user.setRole(role);
        userService.createUser(user);
        return "redirect:/users/view";
    }

    @GetMapping("/view")
    public String view(Model model) {
//        model.addAttribute("users", userService.getAllUsers());
        return "users/view";
    }

    @GetMapping("/remove")
    public String remove(@RequestParam(value = "id") int id) {
        User user = userService.getUser(id);
        userService.removeUser(user);
        return "redirect:/users/view";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(value = "id") int id) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "users/edit";
    }

    @GetMapping("update")
    public String update(@RequestParam(value = "id") int id
            , @RequestParam(value = "user_name") String user_name
            , @RequestParam(value = "password") String password
            , @RequestParam(value = "email") String email
            , @RequestParam(value = "role") String role) {

        User user = userService.getUser(id);
        user.setUser_name(user_name);
        user.setPassword(password);
        user.setEmail(email);
        user.setRole(role);
        user=userService.createUser(user);
        return "redirect:/users/view";

    }


}
