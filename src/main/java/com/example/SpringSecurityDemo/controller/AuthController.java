package com.example.SpringSecurityDemo.controller;

import com.example.SpringSecurityDemo.dto.SignUpRequest;
import com.example.SpringSecurityDemo.model.User;
import com.example.SpringSecurityDemo.service.AuthService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
private AuthService authService;

AuthController(AuthService authService){
    this.authService = authService;
}
@PostMapping("/signup")
public User signUp(@RequestBody @Validated SignUpRequest request){
    return authService.signup(request);
}
}
