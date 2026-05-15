package com.example.SpringSecurityDemo.service;

import com.example.SpringSecurityDemo.dto.SignUpRequest;
import com.example.SpringSecurityDemo.model.User;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    User signup(SignUpRequest request);
}
