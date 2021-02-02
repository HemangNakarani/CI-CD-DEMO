package com.cicd.init.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/hi")
    public String Hi()
    {
        return "<h1>Hello Peeeeeps !!!!</h1>";
    }


    @GetMapping("/")
    public String Hello()
    {
        return "<h1>The Fuckin' Pipline Done !!!</h1>";
    }
}
