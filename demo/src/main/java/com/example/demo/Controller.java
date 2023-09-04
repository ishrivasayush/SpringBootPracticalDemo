package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /*
    Consumer=only takes json
    Consumer=only gives json
     */

    @RequestMapping(path = "/hii",method = RequestMethod.GET,
            consumes = "application/json",produces = "application/json")
    public String getMessages()
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
    public ResponseEntity<User> getUser(@PathVariable int id)
    {
        User user = dbUser.getUser(id);
        MultiValueMap<String,String> headers=new LinkedMultiValueMap<>();
        HttpStatus status=HttpStatus.ACCEPTED;
        headers.put("Server", Collections.singletonList("CodeOfAyush"));
        ResponseEntity<User> response=new ResponseEntity<>(user,headers,status);
        return response;
    }





    //http://localhost:8080/user?q=Ayush

    // The name of q and the paramter should be same.
    @GetMapping("/user")      //----Query Parameter
    public User getSingleUser(@RequestParam String q)
    {
        return dbUser.getUserByName(q);
    }

    //POST APIs

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    //@ResponseStatus(HttpStatus.BAD_GATEWAY)  / change the status code here.
    public User createUser(@RequestBody User user)
    {
        return dbUser.addUser(user);
    }

    //http://localhost:8080/users/1
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id)
    {
        return dbUser.deleteUser(id);
    }
}
/*
4xx ----Issue with clint
2xx ---- fine from both the side
5xx ----- Issue with server
3xx ----  Somthing else
 */
