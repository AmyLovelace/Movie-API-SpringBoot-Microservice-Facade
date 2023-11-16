package com.amylovelave.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
public class GreatingController {


    @RequestMapping(value = "/")
    public String getGreeting() {
        return "stay positive, little sparkle motion";

    }
}
