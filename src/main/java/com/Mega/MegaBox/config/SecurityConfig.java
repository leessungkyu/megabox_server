package com.Mega.MegaBox.config;

import com.Mega.MegaBox.security.JwtAuthFilter;
import com.Mega.MegaBox.security.JwtUtil;
import com.Mega.MegaBox.service.UserDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    private JwtUtil jwtUtil;
    private UserDetailService userDetailService;

    public SecurityConfig(JwtUtil jwtUtil, UserDetailService userDetailService) {
        this.jwtUtil = jwtUtil;
        this.userDetailService = userDetailService;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();  // 비밀번호 암호화
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        JwtAuthFilter jwtAuthFilter = new JwtAuthFilter(userDetailService, jwtUtil);  // 여기서 필터 인스턴스를 생성

        //클라이언트 <-> 서버: http
        http
                .authorizeHttpRequests(authorize -> authorize
                        // /car/** 모두 car로 시작하는 api 허용가능
                        .requestMatchers("/auth/login", "/auth/signup", "/api/**").permitAll()  // 인증 없이 접근 가능
                        .anyRequest().authenticated()  //그 외의 요청은 인증 필요함 ㅅㄱ
                )
                .csrf(csrf -> csrf.disable()) //(cross-site request forgery) 같은 도메인이 아니면 막아주는 도구
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class); //필터링
        return http.build();
    }
}
