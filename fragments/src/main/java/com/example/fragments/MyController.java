package com.example.fragments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showMain() {
        return "index";
    }

    @RequestMapping("/list")
    public String showList() {
        return "showlist";
    }

    @RequestMapping("/add")
    public String showAdd() {
        return "showadd";
    }
}
