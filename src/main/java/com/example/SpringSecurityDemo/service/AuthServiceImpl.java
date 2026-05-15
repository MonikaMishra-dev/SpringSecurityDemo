package com.example.SpringSecurityDemo.service;

import com.example.SpringSecurityDemo.dto.SignUpRequest;
import com.example.SpringSecurityDemo.exception.UserAlreadyExistsException;
import com.example.SpringSecurityDemo.model.User;
import com.example.SpringSecurityDemo.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User signup(SignUpRequest request) {
        if(userRepository.findByUserName(request.getUserName()).isPresent())
            throw new UserAlreadyExistsException("Username already exists");
        User user = User.builder().
                userName(request.getUserName()).
                password(passwordEncoder.encode(request.getPassword())).
                roles(request.getRoles()).
                build();
        return userRepository.save(user);
    }
}
