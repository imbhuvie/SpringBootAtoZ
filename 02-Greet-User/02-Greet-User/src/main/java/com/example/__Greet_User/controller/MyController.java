package com.example.__Greet_User.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.Greeting;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
// @Controller
public class MyController {

    String temmplate = "Hello, ";
    AtomicLong counter=new AtomicLong();

    @RequestMapping("/greet")
    public Greeting getGreetMessage(@RequestParam(value = "name",defaultValue = "Admin") String name) {
        return new Greeting(counter.getAndIncrement(),temmplate+name);
    }
    
}
