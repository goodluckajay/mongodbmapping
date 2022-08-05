package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/saveorder")
    private String placeOrder(@RequestBody User user){

        userRepository.save(user);
        return "Order placed successfully";
    }
    @GetMapping("/getuser/{name}")
    public List<User> getUserByName(@PathVariable String name){

        return   userRepository.findByName(name);
    }
    @GetMapping("/getuserbycity/{city}")
    public List<User> getUserByCity(@PathVariable String city){

        return userRepository.findByCity(city);
    }

}
