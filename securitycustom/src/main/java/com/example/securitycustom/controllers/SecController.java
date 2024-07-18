package com.example.securitycustom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecController {
    @RequestMapping("/")
    public String showMain() {
        return "welcome";
    }

    @RequestMapping("/home")
    public String showHome() {
        return "home";
    }

    @RequestMapping("/sample")
    public String showSample() {
        return "sample";
    }
}
