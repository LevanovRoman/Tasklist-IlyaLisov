package com.myapp.tasklistIlyaLisov.web.controller;

import com.myapp.tasklistIlyaLisov.domain.user.User;
import com.myapp.tasklistIlyaLisov.service.AuthService;
import com.myapp.tasklistIlyaLisov.service.UserService;
import com.myapp.tasklistIlyaLisov.web.dto.auth.JwtRequest;
import com.myapp.tasklistIlyaLisov.web.dto.auth.JwtResponse;
import com.myapp.tasklistIlyaLisov.web.dto.user.UserDto;
import com.myapp.tasklistIlyaLisov.web.dto.validation.OnCreate;
import com.myapp.tasklistIlyaLisov.web.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@Tag(name = "Auth Controller", description = "Auth API")
public class AuthController {

    private final AuthService authService;
    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping("/login")
    public JwtResponse login(@Validated @RequestBody final JwtRequest loginRequest) {
        return authService.login(loginRequest);
    }

    @PostMapping("/register")
    public UserDto register(@Validated(OnCreate.class) @RequestBody final UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        User createdUser = userService.create(user);
        return userMapper.toDto(createdUser);
    }

    @PostMapping("/refresh")
    public JwtResponse refresh(@RequestBody final String refreshToken) {
        return authService.refresh(refreshToken);
    }
}
