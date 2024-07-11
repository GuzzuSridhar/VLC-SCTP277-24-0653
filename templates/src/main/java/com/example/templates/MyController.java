package com.example.templates;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/list")
    public String showList(Model model) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jane");
        names.add("Sara");
        names.add("Jim");
        names.add("Jill");
        names.add("Alex");
        names.add("david");
        names.add("Alex");

        model.addAttribute("list", names);

        return "names";
    }
}
