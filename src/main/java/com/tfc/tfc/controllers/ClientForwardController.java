package com.tfc.tfc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ClientForwardController {
    //If you want weird Pages, that don't go through React -> Directly through Spring Boot, then you gotta put a dot "."
    @GetMapping(value = "/**/{path:[^\\.]*}")
    public String forward(){
        return "forward:/";
    }
}
