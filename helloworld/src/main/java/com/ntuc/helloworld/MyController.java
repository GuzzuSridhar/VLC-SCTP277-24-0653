package com.ntuc.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* 
* there could be multiple controller files in a project
A Controller is any java class that has been annotated with 
    1. @RestController
    2. @Controller
The end points cannot be duplicated
 */

@RestController
public class MyController {
    @RequestMapping("/")
    public String greet() {
        return "Welcome to Spring Boot with java";
    }

    /*
     * If the end point is duplicated as below, the server will not startup the
     * application
     */
    // @RequestMapping("/")
    // public String greetAgain() {
    // return "Welcome to Spring Boot with java";
    // }

    @RequestMapping("/welcome")
    public String x() {
        return "This is a second endpoint";
    }

    @RequestMapping("/welcome/special")
    public String welcome() {
        return "This is a third endpoint";
    }

}
