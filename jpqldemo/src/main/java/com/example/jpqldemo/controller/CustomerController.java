package com.example.jpqldemo.controller;

import java.util.List;
import java.util.Optional;

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
        newCustomer.setCustname(name);
        customerRepo.save(newCustomer);
        return "Customer Record added";
    }

    @RequestMapping("/list")
    public List<Customer> showCustomers() {
        return customerRepo.findAll();
    }

    @RequestMapping("/findone")
    public Customer showOneCustomer(int id) {
        Optional<Customer> cust = customerRepo.findById(id);
        return cust.get();
    }

    @RequestMapping("/populate")
    public String addData() {
        Customer newCustomer = new Customer();
        newCustomer.setCustname("Alex");
        customerRepo.save(newCustomer);
        newCustomer = new Customer();
        newCustomer.setCustname("David");
        customerRepo.save(newCustomer);
        newCustomer = new Customer();
        newCustomer.setCustname("Sara");
        customerRepo.save(newCustomer);
        return "Dummy Data Added";
    }
}
