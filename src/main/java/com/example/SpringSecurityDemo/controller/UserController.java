package com.example.SpringSecurityDemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/profile")
    public String profile() {
        return "User profile";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/method-secured")
    public String methodSecured() {
        return "Method level secured API";
    }
}
