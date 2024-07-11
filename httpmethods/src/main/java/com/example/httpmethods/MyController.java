package com.example.httpmethods;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class MyController {
    /*
     * Http Methods
     * GET
     * POST
     * PUT
     * DELETE
     */

    /* Get Method definition */
    // @RequestMapping(value = "/list", method = RequestMethod.GET)
    @GetMapping("/list")
    public String getMethodName() {
        return "Get Method Accessed";
    }

    public String getMethod() {
        return "Get Method Accessed";
    }

    /* Post Method definition */
    // @RequestMapping(value = "/add", method = RequestMethod.POST)
    @PostMapping("/add")
    public String postMethod() {
        return "Post Method Accessed";
    }

    /*
     * Put Method definition
     * Not supported on HTML forms
     */
    // @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    @PutMapping("/edit")
    public String putMethod() {
        return "Put Method Accessed";
    }

    /*
     * Delete Method definition
     * Not supported on HTML forms
     */
    // @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @DeleteMapping("/delete")
    public String delMethod() {
        return "Delete Method Accessed";
    }

}
