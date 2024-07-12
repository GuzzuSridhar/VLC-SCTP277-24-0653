package com.example.jpqldemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpqldemo.model.Customer;
import com.example.jpqldemo.repo.CustomerRepo;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;

    @RequestMapping("/add")
    public String addCustomer(@RequestParam("name") String name) {
        Customer newCustomer = new Customer();
        customerRepo.save(newCustomer);
        return "Customer Record added";
    }

    @RequestMapping("/list")
    public List<Customer> showCustomers() {
        return customerRepo.findAll();
    }
}
