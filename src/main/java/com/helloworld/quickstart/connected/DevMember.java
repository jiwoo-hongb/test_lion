package com.helloworld.quickstart.connected;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // db테이블과 매핑됨
@Table(name = "dev_member") // 해당 테이블과 연결
@Getter(AccessLevel.PUBLIC) // 모든 필드의 getter 메서드를 자동으로 생성
@NoArgsConstructor // 기본 생성자를 자동으로 생성
@ToString // 객체를 출력할 때, 객체의 필드값을 문자열로 변환하는 메서드 자동 생성

public class DevMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "depart", nullable = false)
    private String depart;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "dev_field", nullable = false)
    private String devField;
}
