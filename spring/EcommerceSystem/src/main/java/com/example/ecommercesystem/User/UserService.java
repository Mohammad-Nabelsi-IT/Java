package com.example.ecommercesystem.User;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserWithCartById(Integer userId) {
        return userRepository.findById(userId).map(
                user -> {
                    // Access the cart to initialize it (lazy loading)
                    user.getCart();
                    // Ensure cart is loaded
                    return user; }
        ).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User getByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
