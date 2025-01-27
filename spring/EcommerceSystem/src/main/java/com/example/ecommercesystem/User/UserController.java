package com.example.ecommercesystem.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users")
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
        return "redirect:/users";
    }

    @GetMapping()
    public String users(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "users";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        User user = userService.getUser(id);
        userService.deleteUser(user);
        return "redirect:/users";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam(value = "id") int id ,Model model) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "users_edit";
    }

    @PostMapping("update")
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
        return "redirect:/users";

    }
    @GetMapping("user_add")
    public String user_add() {
        return "/users/user_add";
    }


}
