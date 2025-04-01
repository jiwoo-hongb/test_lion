package com.helloworld.quickstart.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberRequestDto {
    private int studentId;
    private String name;
    private String department;
    private String email;
    private String devField;
    private int generation;
    private String image;
}