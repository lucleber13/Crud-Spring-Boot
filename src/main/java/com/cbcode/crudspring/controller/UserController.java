package com.cbcode.crudspring.controller;

import com.cbcode.crudspring.model.User;
import com.cbcode.crudspring.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getCars() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

}
