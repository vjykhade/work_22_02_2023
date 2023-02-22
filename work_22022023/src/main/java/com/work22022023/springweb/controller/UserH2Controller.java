package com.work22022023.springweb.controller;

import com.work22022023.springweb.entity.UserH2;
import com.work22022023.springweb.exceptionhandling.UserNotFoundException;
import com.work22022023.springweb.repository.UserH2Repository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class UserH2Controller {

    @Autowired
    UserH2Repository userH2Repository;

    @GetMapping("/users")
    public List<UserH2> retriveAllUsers()
    {
        return userH2Repository.findAll();
    }

    @PostMapping("/users")
    public UserH2 saveUserDetails(@Valid @RequestBody UserH2 userH2)
    {

        return userH2Repository.save(userH2);
    }

    @GetMapping("/users/{id}")
    public Optional<UserH2> retriveOneUserDetails(@PathVariable int id)
    {
        Optional<UserH2> userH2 = userH2Repository.findById(id);
        if(userH2.isEmpty())
            throw new UserNotFoundException("Id: "+ id);
        return userH2;
    }

    @DeleteMapping("/users/{id}")
    public void userDelete(@PathVariable int id)
    {
        userH2Repository.deleteById(id);
    }


}
