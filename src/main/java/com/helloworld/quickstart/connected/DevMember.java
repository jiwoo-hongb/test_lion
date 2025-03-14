package com.helloworld.quickstart.connected;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "dev_member")
@Getter(AccessLevel.PUBLIC)
@NoArgsConstructor
@ToString

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
