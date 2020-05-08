package com.cic.spring_cloud_product;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/demo", method= RequestMethod.GET)
public class Aproduct {
    @PostMapping(value = "/hello")
    public String hello(){
        return "hello word!";
    }
}
