package com.codesoom.assignment.application;

import com.codesoom.assignment.utils.JwtUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AuthenticationServiceTest {
    private AuthenticationService authenticationService;

    @BeforeEach
    void setUp() {
        String secret ="12345678901234567890123456789012";

        JwtUtil jwtUtil = new JwtUtil(secret);
        
        authenticationService = new AuthenticationService(jwtUtil);
    }

    @Test
    void login() {
        String accessToken = authenticationService.login();
        // 테스트코드의 fail 을 활용한 꼼수 쓰기
        assertThat(accessToken).contains(".");
    }




}