package com.environmentDeploy1.environmentDepoloy1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class DevController {
    @Autowired
    private Environment environment;

    @GetMapping
    public String greetings() {
        return "ciao " + environment.getProperty("devName") + " " + environment.getProperty("authCode");
    }
}
