package com.sorclab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController
{
    @RequestMapping("/")
    public String home() {
        return "Hello from PageController.";
    }
}
