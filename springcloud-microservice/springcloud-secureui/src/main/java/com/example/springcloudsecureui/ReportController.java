package com.example.springcloudsecureui;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    @RequestMapping("/")
    public String loadHome() {
        return "home";
    }
}
