package com.example.multicontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user") // used as prefix to the endpoints on the methods
public class UserController {
    @RequestMapping("/add") // will be read as "/user/add"
    public String addUser() {
        return "User ADD";
    }

    @RequestMapping("/view")
    public String viewUser() {
        return "User View";
    }

    @RequestMapping("/edit")
    public String editUser() {
        return "User Edit";
    }

    @RequestMapping("/delete")
    public String removeUser() {
        return "User delete";
    }

}
