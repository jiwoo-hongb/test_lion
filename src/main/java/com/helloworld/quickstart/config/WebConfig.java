package com.helloworld.quickstart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")  // 모든 경로에 대해 CORS 허용
                        .allowedOrigins("http://localhost:3000", "http://localhost:8080")  // 요청 허용할 도메인
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // 허용할 HTTP 메서드
                        .allowedHeaders("*")  // 모든 헤더 허용
                        .allowCredentials(true);  // 쿠키 및 인증 정보 포함 허용
            }
        };
    }
}


