package com.example.thymeleafstrings;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/test")
    public String showStr(Model model) {
        model.addAttribute("test", "Welcome to Thymeleaf with Spring Boot");
        return "test";
    }
}
