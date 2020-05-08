package com.cic.service_config;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/config", method= RequestMethod.GET)
public class Aconfig {
    @PostMapping(value = "/aaa")
    public String getConfig(){
        return "";
    }
}
