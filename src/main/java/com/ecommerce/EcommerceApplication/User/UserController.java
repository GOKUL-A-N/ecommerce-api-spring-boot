package com.ecommerce.EcommerceApplication.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping
    public List<UserModel> getAllusers()
    {
        return userservice.getAllusers();
    }

    @GetMapping("/{id}")
    public UserModel getUser(@PathVariable String id)
    {
        return userservice.getUser(id);
    }

    @PostMapping
    public UserModel createUser(@RequestBody UserModel usermodel)
    {
        return userservice.createUser(usermodel);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id)
    {
        userservice.deleteUser(id);
    }
}
