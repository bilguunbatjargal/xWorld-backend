package com.backend.xworld.controller;

import com.backend.xworld.model.User;
import com.backend.xworld.service.FirebaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

    @Autowired
    FirebaseService firebaseService;

    @GetMapping("/getUserDetails")
    public User getUser(@RequestHeader() String email) throws ExecutionException, InterruptedException {
        return firebaseService.getUserDetails(email);
    }

    @PostMapping("/signup")
    public String createUser(@RequestBody User user) throws ExecutionException, InterruptedException {
        System.out.println(user.toString());
        return firebaseService.saveUserDetails(user);
    }

    @PostMapping("/updateUser")
    public String updateUser(@RequestBody User user) throws ExecutionException, InterruptedException {
        return firebaseService.updateUserDetails(user);
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestHeader String email){
        return firebaseService.deleteUser(email);
    }

}
