package com.sorclab.controller;

import com.sorclab.service.DisplayEnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class EnvironmentController
{
    @Autowired
    DisplayEnvironmentService displayEnv;

    @Value("${spring.jpa.generate-ddl}")
    String msg;

    @RequestMapping("/environment")
    public String displayEnvironment() {
        return Arrays.toString(displayEnv.getActiveProfiles()) + msg;
    }
}
