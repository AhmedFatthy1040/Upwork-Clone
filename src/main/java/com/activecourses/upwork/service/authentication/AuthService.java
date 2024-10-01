package com.activecourses.upwork.service.authentication;

import com.activecourses.upwork.dto.authentication.login.LoginRequestDto;
import com.activecourses.upwork.dto.authentication.login.LoginResponseDto;
import com.activecourses.upwork.model.User;

public interface AuthService {
    void registerUser(User user);
    LoginResponseDto login(LoginRequestDto loginRequestDto);
    boolean verifyUser(String token);
    User findByEmail(String email);
    void sendVerificationEmail(User user);
}
