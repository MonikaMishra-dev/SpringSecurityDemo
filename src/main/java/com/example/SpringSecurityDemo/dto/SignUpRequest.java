package com.example.SpringSecurityDemo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SignUpRequest {

    @NotBlank(message = "username must not be blank")
    private String userName;

    @NotBlank(message = "password must not be blank")
    private String password;

    private Set<String> roles;

}
