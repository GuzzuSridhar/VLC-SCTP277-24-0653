package com.example.securityjpa.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.securityjpa.model.Role;
import com.example.securityjpa.model.User;
import com.example.securityjpa.repo.RoleRepository;
import com.example.securityjpa.repo.UserRepository;

@Controller
public class UserController {

    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

    @RequestMapping("/")
    public String showUsers(Model model, Principal principal) {
        List<User> usersList = userRepository.findAll();
        // System.out.println(usersList.size());
        // System.out.println(usersList.get(0).getUserName());
        model.addAttribute("userList", usersList);
        model.addAttribute("userName", principal.getName());
        model.addAttribute("principal", principal);
        return "index";
    }

    @RequestMapping("/new")
    public String addUser(User user, Model model) {
        model.addAttribute("user", user);
        List<Role> listRoles = roleRepository.findAll();
        model.addAttribute("listRoles", listRoles);
        return "adduser";
    }

    @RequestMapping("/save")
    public String saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "redirect:/";
    }

}
