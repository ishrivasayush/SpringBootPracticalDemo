package com.Narainox.SpringBootDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/hi")
    public String sayHello()
    {
        return "Hello Ayush!";
    }

    // http://localhost:8080/search?q=Ayush
    @GetMapping("/search")
    public String getMessage(@RequestParam String q)
    {
        return "A Good Batsman";
    }

    //http://localhost:8080/searchs?q=Abhay
    //http://localhost:8080/searchs?q=Ayush
    //http://localhost:8080/searchs?q=Ayushi

    @GetMapping("/searchs")
    public String getWord(@RequestParam String q)
    {
        DataStore db=new DataStore();
        return db.searchAWord(q);
    }

    //http://localhost:8080/searchs?q=Ayushi&p=Abhay
    @GetMapping("/searc")
    public String getWords(@RequestParam String q,@RequestParam String p)
    {
        DataStore db=new DataStore();
        return db.searchAWord(q);
    }
}
