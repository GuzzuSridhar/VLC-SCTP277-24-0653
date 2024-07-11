package com.example.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaclController {
    @RequestMapping("/")
    public String add(@RequestParam(value = "n1", required = false, defaultValue = "0") int n,
            @RequestParam(value = "n2", required = false, defaultValue = "0") int m,
            Model model,
            @RequestParam(value = "opr", required = false, defaultValue = "add") String opr) {
        if (opr.equalsIgnoreCase("add"))
            model.addAttribute("res", n + m);
        else if (opr.equalsIgnoreCase("diff"))
            model.addAttribute("res", n - m);
        else if (opr.equalsIgnoreCase("prod"))
            model.addAttribute("res", n * m);
        else if (opr.equalsIgnoreCase("div"))
            model.addAttribute("res", n / m);
        return "calc";
    }

    // @RequestMapping("/diff")
    // public String diff(@RequestParam("n1") int n, @RequestParam("n2") int m,
    // Model model) {
    // model.addAttribute("res", n - m);
    // return "calc";
    // }

    // @RequestMapping("/prod")
    // public String prod(@RequestParam("n1") int n, @RequestParam("n2") int m,
    // Model model) {
    // model.addAttribute("res", n * m);
    // return "calc";
    // }

    // @RequestMapping("/quot")
    // public String divide(@RequestParam("n1") int n, @RequestParam("n2") int m,
    // Model model) {
    // model.addAttribute("res", n / m);
    // return "calc";
    // }

}
