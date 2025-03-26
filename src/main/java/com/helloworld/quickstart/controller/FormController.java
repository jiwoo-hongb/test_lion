package com.helloworld.quickstart.controller;

import com.helloworld.quickstart.dto.FormRequestDto;
import com.helloworld.quickstart.connected.Form;
import com.helloworld.quickstart.service.FormService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/form") // API URL을 통일
@RequiredArgsConstructor
@Tag(name = "Form Controller", description = "지원서 제출 API")
public class FormController {

    private final FormService formService;

    @PostMapping("/submit") // "/api/form/submit" 으로 요청 가능
    @Operation(summary = "지원서 제출", description = "사용자가 신청 폼을 제출하면 데이터베이스에 저장됩니다.")
    public Form submitForm(@RequestBody FormRequestDto requestDto) {
        return formService.saveForm(requestDto);
    }
}
