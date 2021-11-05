package com.example.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class Hello {
    @Get("/hello")
    public String sayHello(){
        return "Hello";
    }
}
