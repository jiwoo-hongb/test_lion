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
    private String devPart;
    private String motivation;
    private String project;

    public Form toEntity() {
        return Form.builder()
                .studentId(studentId)
                .name(name)
                .department(department)
                .email(email)
                .devPart(devPart)
                .motivation(motivation)
                .project(project)
                .build();
    }
}
