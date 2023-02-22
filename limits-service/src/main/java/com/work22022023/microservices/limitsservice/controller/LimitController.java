package com.work22022023.microservices.limitsservice.controller;

import com.work22022023.microservices.limitsservice.bean.Limits;
import com.work22022023.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retriveLimits()
    {
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }
}
