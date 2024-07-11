package com.example.requestparam;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    ArrayList<String> names = new ArrayList<>();

    @RequestMapping("/list")
    public String showNames(Model model) {
        // names.add("Alex");
        model.addAttribute("list", names);
        return "view";
    }

    // @RequestMapping("/add")
    // public String addNames() {
    // return "add";
    // }

    @RequestMapping("/save")
    public String saveName(@RequestParam(value = "input") String name) {
        names.add(name);
        /* implicitly calling the "/list" endpoint */
        return "redirect:/list";
        /* alternate is that we can write the List endpoint's code here */
        // // model.addAttribute("list", names);
        // return "view";
    }
}
