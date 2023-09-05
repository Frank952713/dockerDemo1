package com.example.dockerdemo1.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class OrderController {

    @Value("${server.port}")
    public String port;

    @GetMapping("/order/hello")
    public String hello(){
        return "hello"+port+ UUID.randomUUID();
    }

    @GetMapping("/order/index")
    public String index(){
        return "index"+port+ UUID.randomUUID();
    }
}
