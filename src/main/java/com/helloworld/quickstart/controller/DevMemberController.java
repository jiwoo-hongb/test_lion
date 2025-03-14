package com.helloworld.quickstart.controller;

import com.helloworld.quickstart.connected.DevMember;
import com.helloworld.quickstart.repository.DevMemberRepository;
import com.helloworld.quickstart.service.DevMemberService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/devMember")
public class DevMemberController {

    private final DevMemberService devMemberService; // DevMemberService 사용

    public DevMemberController(DevMemberService devMemberService) {
        this.devMemberService = devMemberService;
    }

    @GetMapping
    public List<DevMember> getAllDevMember() {
        return devMemberService.getAllDevMembers(); // ✅ Service를 통해 데이터 가져옴
    }
}

