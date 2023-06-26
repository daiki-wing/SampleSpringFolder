package com.example.demo.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class indexController {
    @GetMapping
    public String showIndex(){
        return "index";
    }    
}
