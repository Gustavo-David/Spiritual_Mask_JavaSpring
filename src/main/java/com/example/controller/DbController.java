package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DbController {
    
    @GetMapping("/status")
    public String getStatus() {
        return "status";
    }
}