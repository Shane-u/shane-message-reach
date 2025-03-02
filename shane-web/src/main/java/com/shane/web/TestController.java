package com.shane.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/healthcheck")
    private String healthCheck(){
        return "healthcheck!";
    }
}
