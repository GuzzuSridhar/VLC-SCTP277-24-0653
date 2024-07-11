package com.example.statichtml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/test")
    public String showTest() {
        return "test.html"; // the spring container will look for a file called "test.html" in the
                            // resources/static folder
    }

}
