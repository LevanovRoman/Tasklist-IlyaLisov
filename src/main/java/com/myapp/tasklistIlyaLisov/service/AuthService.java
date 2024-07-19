package com.myapp.tasklistIlyaLisov.service;

import com.myapp.tasklistIlyaLisov.web.dto.auth.JwtRequest;
import com.myapp.tasklistIlyaLisov.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);

}
