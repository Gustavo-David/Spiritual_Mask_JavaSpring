package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class NavegationController{

    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }

}
