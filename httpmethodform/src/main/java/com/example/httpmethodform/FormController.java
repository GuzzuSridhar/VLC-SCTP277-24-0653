package com.example.httpmethodform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class FormController {
    @GetMapping("get")
    public String getMethodName(Model model) {
        model.addAttribute("getmsg", "Get Method");
        return "index";
    }

    @PostMapping("add")
    public String postMethodName(Model model) {
        model.addAttribute("postmsg", "Post Method");
        return "index";
    }

    @PutMapping("/edit")
    public String putMethodName(Model model) {
        model.addAttribute("putmsg", "Put Method");
        return "index";
    }

    @DeleteMapping("/delete")
    public String deleteMethodName(Model model) {
        model.addAttribute("delmsg", "Delete Method");
        return "index";
    }

}
