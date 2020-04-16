package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
   
    public Hello(){

    }
    @GetMapping(value = "/hello")
    public String PrintHello(){
        return "Hello";
    }
}