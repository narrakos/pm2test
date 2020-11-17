package com.spring.pm2test.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BejegyzesRestController {

    @RequestMapping("/hello")
    public String HelloWorld() {
        return "Hello World!";
    }
}
