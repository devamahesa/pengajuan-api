package com.approval.pengajuan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StarterController {
    @GetMapping
    public String greetings() {
        return "Spring Boot is Started";
    }
}
