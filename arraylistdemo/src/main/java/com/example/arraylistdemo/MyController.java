package com.example.arraylistdemo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/list")
    public ArrayList<String> listNames() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jim");
        names.add("Jane");
        names.add("Jill");
        names.add("Jack");

        return names;
    }

    @RequestMapping("/html")
    public String showHtml() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jim");
        names.add("Jane");
        names.add("Jill");
        names.add("Jack");

        String temp = "<ul>";

        for (String name : names) {
            temp += "<li>" + name + "</li>";
        }

        temp += "</ul>";

        return temp;

    }

}
