package com.example.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateController {

    @Value("${rate}")
    private String rate;
    @Value("${lanecount}")
    private String lanecount;
    @Value("${tollstart}")
    private String tollstart;

    @RequestMapping(value = "/rate")
    public String display() {
        return this.rate+"-"+this.lanecount+"-"+this.tollstart;
    }

}
