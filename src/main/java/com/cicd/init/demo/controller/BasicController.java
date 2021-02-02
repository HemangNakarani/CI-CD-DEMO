package com.cicd.init.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/hi")
    public String Hello()
    {
        return "<h1>Hello Peeeeeps !!!!</h1>";
    }
}
