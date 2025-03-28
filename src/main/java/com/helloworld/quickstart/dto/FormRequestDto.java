package com.helloworld.quickstart.dto;

import com.helloworld.quickstart.connected.Form;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormRequestDto {
    private int studentId;
    private String name;
    private String department;
    private String email;
    private String devField;
    private String motivation;
    private String project;

    public Form toEntity() {
        return Form.builder()
                .studentId(studentId)
                .name(name)
                .department(department)
                .email(email)
                .devField(devField)
                .motivation(motivation)
                .project(project)
                .build();
    }
}
