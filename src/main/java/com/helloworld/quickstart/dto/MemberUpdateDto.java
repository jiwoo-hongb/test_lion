package com.helloworld.quickstart.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class MemberUpdateDto {

    @Schema(description = "새로운 학생 ID", example = "20231234", required = false)
    private Integer studentId;

    @Schema(description = "새로운 학과", example = "소프트웨어공학과", required = false)
    private String department;

    @Schema(description = "새로운 이메일", example = "newemail@example.com", required = false)
    private String email;

    @Schema(description = "새로운 개발 분야", example = "Frontend", required = false)
    private String devField;

    @Schema(description = "새로운 기수", example = "14", required = false)
    private Integer generation;
}