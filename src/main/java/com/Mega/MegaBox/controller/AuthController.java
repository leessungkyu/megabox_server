package com.Mega.MegaBox.controller;

import com.Mega.MegaBox.model.LoginRequest;
import com.Mega.MegaBox.model.UserDetailCustom;
import com.Mega.MegaBox.security.JwtUtil;
import com.Mega.MegaBox.service.UserDetailService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private UserDetailService userDetailService;
    private PasswordEncoder passwordEncoder;
    private JwtUtil jwtUtil;

    public AuthController(UserDetailService userDetailService, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.userDetailService = userDetailService;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest){
        UserDetailCustom userDetailCustom = userDetailService.loadUserByUsername(loginRequest.getUsername());
        if (passwordEncoder.matches(userDetailCustom.getPassword(), loginRequest.getPassword())){
            return "Password Error";
        }
        return jwtUtil.generateToken(loginRequest.getUsername());
    }

    @PostMapping("signup")
    public ResponseEntity<String> signup(@RequestBody LoginRequest loginRequest){
        userDetailService.saveUser(loginRequest);
        return ResponseEntity.status(200).body("회원가입성공");
    }
}
