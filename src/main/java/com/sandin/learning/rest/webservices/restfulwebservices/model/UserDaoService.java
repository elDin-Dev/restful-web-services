package com.sandin.learning.rest.webservices.restfulwebservices.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int  userCount = 3;
    static {
        users.add(new User(1,"alex", "01/02/1976"));
        users.add(new User(2,"vicent", "01/12/1990"));
        users.add(new User(2,"david", "01/12/1974"));
    }

    public List<User> findAll() {
        return this.users;
    }
    public User save(User user){
        
        if (user.getId()==null){
            user.setId(++this.userCount);
        }
        users.add(user);
        
        return user;
    }

    public User find(Integer id){
        for(User u: users){
            if (u.getId().equals(id)) return u;
        }
        return null;
    }
}
