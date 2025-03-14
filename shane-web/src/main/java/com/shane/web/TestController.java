package com.shane.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @RequestMapping("/healthcheck")
    private String healthCheck(){
        log.info("healthcheck!");
        return "healthcheck!";
    }

}
