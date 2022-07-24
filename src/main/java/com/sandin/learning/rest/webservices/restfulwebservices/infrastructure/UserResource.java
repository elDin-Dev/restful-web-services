package com.sandin.learning.rest.webservices.restfulwebservices.infrastructure;

import com.sandin.learning.rest.webservices.restfulwebservices.model.User;
import com.sandin.learning.rest.webservices.restfulwebservices.model.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return this.service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        return this.service.find(id);
    }
}
