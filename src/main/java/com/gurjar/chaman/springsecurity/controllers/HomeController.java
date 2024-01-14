package com.gurjar.chaman.springsecurity.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("ping")
    public String ping() {
        return "Spring-Security Project is running.  Current date : " + new Date();
    }

}
