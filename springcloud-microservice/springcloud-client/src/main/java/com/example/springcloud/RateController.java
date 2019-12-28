package com.example.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RateController {

    @Value("${lanecount}")
    private String lanecount;
    @Value("${rate}")
    private String rate;
    @Value("${tollstart}")
    private String tollstart;
    @Value("${connstring}")
    private String connstring;

    @RequestMapping(value = "/rate")
    public String display() {
        return "[Rate = "+this.rate+ "] = [Lanecount ="+this.lanecount+"] = [tollstart ="+this.tollstart +" ] = [ connstring="+connstring+" ]";
    }
}
