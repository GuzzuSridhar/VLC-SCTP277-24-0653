package com.example.multicontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {
    @RequestMapping("/")
    public String welcome() {
        return "Welcome to my bank";
    }
}
