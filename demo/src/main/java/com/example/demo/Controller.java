package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    DbUser dbUser=new DbUser();

    //GET APIs

    //http://localhost:8080/hi
    @GetMapping("/hi")
    public String getMessage()
    {
        return "Hello Ayush";
    }

    //http://localhost:8080/users
    @GetMapping("/users")
    public List<User> getAllUser()
    {
        return dbUser.getAllUser();
    }

    //http://localhost:8080/users/1
    @GetMapping("/users/{id}")  //----Path Parameter
    public User getUser(@PathVariable int id)
    {
        return dbUser.getUser(id);
    }

    //http://localhost:8080/user?q=Ayush

    // The name of q and the paramter should be same.
    @GetMapping("/user")      //----Query Parameter
    public User getSingleUser(@RequestParam String q)
    {
        return dbUser.getUserByName(q);
    }

    //POST APIs
}
