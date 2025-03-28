package com.helloworld.quickstart.connected;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "form")
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private int studentId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String department;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String devField;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String motivation;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String project;
}
