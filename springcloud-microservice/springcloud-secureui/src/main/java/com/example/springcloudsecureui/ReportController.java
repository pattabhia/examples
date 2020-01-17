package com.example.springcloudsecureui;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    @RequestMapping("/home")
    public String loadHome() {
        return "home";
    }
}
