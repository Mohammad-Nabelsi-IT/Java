package com.example.ecommercesystem.User;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void removeUser(User user) {
        userRepository.delete(user);
    }

    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }

//    public List<User> getAllUsers() {
//        return  userRepository.findAll();
//    }
}
