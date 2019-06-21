package com.gfg.laviksha.SpringBootBackendService.controller;

import com.gfg.laviksha.SpringBootBackendService.Model.User;
import com.gfg.laviksha.SpringBootBackendService.Service.UserServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserServiceDao userServiceDao;

    @GetMapping("/users")
    public List<User> getAllUsers(){
         return userServiceDao.findAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userServiceDao.findUserById(id);
    }

    @PostMapping("user")
    public User createUser(@RequestBody User user){
        return userServiceDao.createUser(user);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        return userServiceDao.updateUser(user);
    }

    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable("id") Long id){
         userServiceDao.deleteUser(id);
    }
}
