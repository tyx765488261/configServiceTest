package com.cic.spring_cloud_cosumer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping(value="/cosum", method= RequestMethod.GET)
@RestController
public class XCosummer {
    @PostMapping(value = "/cosumhello")
    public String getPro(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8891/demo/hello",String.class);
    }
}
