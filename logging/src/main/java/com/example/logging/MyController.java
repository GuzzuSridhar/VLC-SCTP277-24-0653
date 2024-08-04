package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    // sl4j = simple logging facade for java
    Logger logger = LoggerFactory.getLogger("MyController.class");

    @RequestMapping("/")
    public String test() {
        logger.info("Message Logged and root accessed");
        return "test";
    }
}
