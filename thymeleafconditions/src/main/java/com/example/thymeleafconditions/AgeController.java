package com.example.thymeleafconditions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AgeController {
    @RequestMapping("/test")
    public String showTest(Model m, @RequestParam("age") int age) {
        m.addAttribute("age", age);
        return "welcome";
    }
}
