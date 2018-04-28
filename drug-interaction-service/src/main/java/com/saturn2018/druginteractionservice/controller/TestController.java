package com.saturn2018.druginteractionservice.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    public String testMessage() {
        return "Service is up! ";
    }
}
