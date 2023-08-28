package com.Narainox.SpringBootDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/hi")
    public String sayHello()
    {
        return "Hello Ayush!";
    }

}
