package com.helloworld.quickstart.connected;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "member")  // member 테이블에 매핑
@Getter(AccessLevel.PUBLIC)
@NoArgsConstructor
@ToString

public class Member {
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
    private String dev_field;
}
