package com.helloworld.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(DevMemberApplication.class, args);
    }
}
//자동으로 컴포넌트 스캔 수행 => spring bean으로 등록함