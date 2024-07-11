package com.example.multicontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trans") // used as prefix to the endpoints on the methods
public class TransactionController {
    @RequestMapping("/add") // is read as "/trans/add"
    public String addTransaction() {
        return "Transaction Add";
    }

    @RequestMapping("/view")
    public String viewTransaction() {
        return "Transaction View";
    }
}
